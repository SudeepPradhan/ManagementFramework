package decorators;

import businessmodels.User;

public abstract class UserDecorator extends User {

    protected User baseUser;

    public UserDecorator(User baseUser) {
        super(baseUser.getUsername(), baseUser.getPassword());
        this.baseUser = baseUser;
    }
}
