package controllers;

import java.util.List;
import businessmodels.Address;

import businessmodels.CheckoutRecordEntry;
import businessmodels.Inventory;
import decorators.CustomerDecorator;

public interface CirculationController {

    /**
     * Searches for a library member by ID.
     *
     * @param memberId the library member ID.
     * @return the {@link LibraryMember} if found, {@code null} otherwise.
     */
    CustomerDecorator searchCustomer(String memberId);

    /**
     * Gets list of library members.
     *
     * @return list of library members.
     */
    public List<CustomerDecorator> getCustomer();

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
    boolean addCustomer(String memberId, String firstName, String lastName, Address address, String phoneNumber);

    /**
     *
     * @param memberId
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     * @return
     */
    boolean updateCustomer(String memberId, String firstName, String lastName, Address address, String phoneNumber);
}
