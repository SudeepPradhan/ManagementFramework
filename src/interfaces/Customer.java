/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import businessmodels.CheckoutRecord;


public interface Customer {
    
    public String getCustomerId();

    public void setCustomerId(String customerId);

    public CheckoutRecord getCheckoutRecord();

    public void setCheckoutRecord(CheckoutRecord checkoutRecord);
}

