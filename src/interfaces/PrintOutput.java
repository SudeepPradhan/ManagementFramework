/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import businessmodels.CheckoutRecordEntry;

/**
 *
 * @author Sudeep
 */
public interface PrintOutput {
    public String PrintOutString(int index, String format);
    public void addCheckoutRecordEntry(CheckoutRecordEntry checkoutRecordEntry);
}
