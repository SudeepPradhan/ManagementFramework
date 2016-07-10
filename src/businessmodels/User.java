package businessmodels;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
 public static enum UserType {

        ADMIN, LIBRARIAN, BOTH
    };
    String username;
    String password;
    private List<Role> roles;
    private UserType userType;

    public User(String userName, String password, UserType userType) {
        this.username = userName;
        this.password = password;
        this.userType=userType;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    /**
     * @return the roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
