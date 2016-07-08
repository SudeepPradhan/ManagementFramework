package businessmodels;

public class Permission {

    private String name;
    private AccessType accessType;
    public static final String PRODUCT_PERMISSION="product";
    public static final String CIRCULATION_PERMISSION="circulation";
    public static final String CUSTOMER_PERMISSION="customer";
    public static final String USER_PERMISSION="user";
    
    public Permission(String objectName, AccessType accessType) {
        this.name = objectName;
        this.accessType = accessType;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the objectName to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the accessType
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * @param accessType the accessType to set
     */
    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }
}
