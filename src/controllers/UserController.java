package controllers;

import businessmodels.AccessType;
import businessmodels.Permission;
import businessmodels.User;
import database.Database;
import exceptions.InvalidArgumentException;
import exceptions.UnauthorizedAccessException;
import java.security.NoSuchAlgorithmException;

import java.util.List;
import security.Session;
import security.hash.PasswordHasher;
import security.hash.HashingMethod;

public abstract class UserController extends Controller {

    protected PasswordHasher passwordHasher;

    public UserController(Database database, HashingMethod encryptionMethod) {
        super(database, Permission.USER_PERMISSION);
        this.passwordHasher = new PasswordHasher(encryptionMethod);
    }

    public abstract boolean validate(User user);

    public final boolean saveUser(User user) throws NoSuchAlgorithmException, InvalidArgumentException, UnauthorizedAccessException {
        checkAccess(AccessType.CREATE);
        if (!validate(user)) {
            throw new InvalidArgumentException(user);
        }
        String oldPassword = user.getPassword();
        user.setPassword(passwordHasher.encrypt(oldPassword));
        if (database.createUser(user)) {
            return true;
        } else {
            user.setPassword(oldPassword);
            return false;
        }
    }

    public final boolean updateUser(User user) throws NoSuchAlgorithmException, InvalidArgumentException, UnauthorizedAccessException {
        checkAccess(AccessType.UPDATE);
        if (!validate(user)) {
            throw new InvalidArgumentException(user);
        }

        String oldPassword = user.getPassword();
        user.setPassword(passwordHasher.encrypt(oldPassword));
        if (database.updateUser(user)) {
            return true;
        } else {
            user.setPassword(oldPassword);
            return false;
        }
    }

    public final List<User> getAllUsers() throws UnauthorizedAccessException {
        checkAccess(AccessType.READ);
        return database.getAllUsers();
    }

    public final User authenticate(String username, String password) throws NoSuchAlgorithmException {
        User user = database.searchUser(username);
        if (user != null) {
            if (user.getPassword().equals(passwordHasher.encrypt(password))) {
                return user;
            }
        }
        return null;
    }

    public final boolean login(String username, String password) throws NoSuchAlgorithmException {
        User user = authenticate(username, password);
        if (user != null) {
            Session.INSTANCE.setUser(user);
            return true;
        } else {
            return false;
        }
    }

    public final void logout() {
        Session.INSTANCE.setUser(null);
    }
}
