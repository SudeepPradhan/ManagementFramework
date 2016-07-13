package controllers;

import java.util.List;
import businessmodels.Address;
import businessmodels.Owner;

public interface OwnerController {
    /**
     * Adds a new Owner.
     * 
     * @param firstName the first name..
     * @param lastName the last name.
     * @param address the {@link Address}. Can be null.
     * @param phoneNumber the phone number.
     * @param credentials the credentials.
     * @param bibliography the bibliography.
     * @return 
     */
    boolean createOwner(String firstName, String lastName,  Address address, String phoneNumber, String credentials, String bibliography);
    
    /**
     * Updates an existing author.
     * @param author the {@link  Owner} instance.
     * @param firstName the first name..
     * @param lastName the last name.
     * @param address the {@link Address}. Can be null.
     * @param phoneNumber the phone number.
     * @param credentials the credentials.
     * @param bibliography the bibliography.
     * @return true if the operation succeeds, false otherwise.
     */
    boolean updateOwner(Owner author, String firstName,  String lastName, Address address, String phoneNumber, String credentials, String bibliography);
   
    /**
     * Search authors by last name.
     * 
     * @param name the last name or sequence of characters in last name.
     * @return list of {@link Owner}s.
     */
    List<Owner> searchOwners(String name); 
    
    /**
     * Gets all authors.
     * @return  list of {@link Owner}s.
     */
    List<Owner> getOwners();
}
