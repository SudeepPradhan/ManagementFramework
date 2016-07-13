package controllers;

import java.util.List;
import businessmodels.Address;

import businessmodels.CheckoutRecordEntry;
import businessmodels.Inventory;
import decorators.CustomerDecorator;
// new branch
public interface CirculationController {

    /**
     * Searches for a library member by ID.
     *
     * @param memberId the library member ID.
     * @return the {@link LibraryMember} if found, {@code null} otherwise.
     */
    CustomerDecorator searchLibraryMember(String memberId);

    /**
     * Gets list of library members.
     *
     * @return list of library members.
     */
    public List<CustomerDecorator> getLibraryMembers();

    /**
     *
     * @param memberId
     * @param inventory
     * @return
     */
    boolean checkout(String memberId, Inventory inventory);

    /**
     *
     * @param memberId
     * @param checkoutRecordEntry
     * @return
     */
    boolean checkin(String memberId, CheckoutRecordEntry checkoutRecordEntry);

    /**
     *
     * @param memberId
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     * @return
     */
    boolean addLibraryMember(String memberId, String firstName, String lastName, Address address, String phoneNumber);

    /**
     *
     * @param memberId
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     * @return
     */
    boolean updateLibraryMember(String memberId, String firstName, String lastName, Address address, String phoneNumber);
}
