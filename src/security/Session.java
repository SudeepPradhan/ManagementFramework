package security;

import businessmodels.User;

public enum Session {

    INSTANCE;

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public boolean hasLoggedInUser() {
        return user != null;
    }

}
