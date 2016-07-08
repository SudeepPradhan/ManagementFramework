package businessmodels;

import java.util.List;

public class Role {
    private String name;
    private List<Permission> permission;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the permission
     */
    public List<Permission> getPermission() {
        return permission;
    }

    /**
     * @param permission the permission to set
     */
    public void setPermission(List<Permission> permission) {
        this.permission = permission;
    }
    
}
