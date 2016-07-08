package controllers;

import businessmodels.AccessType;
import businessmodels.Permission;
import businessmodels.Role;
import businessmodels.User;
import database.Database;
import exceptions.UnauthorizedAccessException;
import java.util.List;
import security.Session;

public abstract class Controller {

    protected Database database;
    private final String permissionName;

    public Controller(Database database, String permissionName) {
        this.database = database;
        this.permissionName = permissionName;
    }

    protected void checkAccess(AccessType accessType) throws UnauthorizedAccessException {
        User user = Session.INSTANCE.getUser();
        if (user == null) {
            throw new UnauthorizedAccessException("No user is logged in");
        }

        // get user role
        List<Role> roles = user.getRoles();
        if (roles == null || roles.isEmpty()) {
            throw new UnauthorizedAccessException("User has no access");
        }

        for (Role role : roles) {
            List<Permission> permissions = role.getPermission();
            if (permissions == null || permissions.isEmpty()) {
                throw new UnauthorizedAccessException("User has no access");
            }

            for (Permission permission : permissions) {
                if (permission.getAccessType() == accessType && permission.getName().equalsIgnoreCase(permissionName)) {
                    return;
                }
            }
        }
        throw new UnauthorizedAccessException("User has no access");
    }
}
