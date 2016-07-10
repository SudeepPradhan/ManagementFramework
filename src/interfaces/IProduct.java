/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import businessmodels.Inventory;
import java.util.List;

public interface IProduct {

	public void addDefaultInventory(int numInventoryToAdd);

	public void addInventory(Inventory inventory);

	public void addAllInventory(List<Inventory> inventory);

	public long getNumberOfAvailableInventory();

	public List<Inventory> getAvailableInventory();

	public long getNumberOfUnavailableInventory();

	public List<Inventory> getUnvailableInventory();

	public long getNumberOfInventory();

	public List<Inventory> getInventory();

	public double getDailyRate();

	public void setDailyRate(double dailyRate);

	public double getDailyFine();

	public void setDailyFine(double dailyFine);

	public String getProductId();

	public void setProductId(String productId);
        
        public int getBorrowDuration();
        
        public void setBorrowDuration(int borrowDuration);
            
        public void setTitle(String title);

        public String getTitle();
}
