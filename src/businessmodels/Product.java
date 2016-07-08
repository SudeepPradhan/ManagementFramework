package businessmodels;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	protected String productId;
	protected double dailyRate;
	protected double dailyFine;
	protected List<Inventory> inventory;

	public Product(String productId, double dailyRate, double dailyFine) {
		this.productId = productId;
		this.dailyRate = dailyRate;
		this.dailyFine = dailyFine;
		inventory = new ArrayList<>();
	}

	public void addDefaultInventory(int numInventoryToAdd) {
		while (numInventoryToAdd-- > 0) {
			inventory.add(new DefaultInventory((inventory.size() + 1) + "", this));
		}
	}

	public void addInventory(Inventory inventory) {
		this.inventory.add(inventory);
	}

	public void addAllInventory(List<Inventory> inventory) {
		inventory.forEach(i -> {
			if (!Product.this.inventory.contains(i)) {
				Product.this.inventory.add(i);
			}
		});
	}

	public long getNumberOfAvailableInventory() {
		return inventory.stream().filter(i -> i.isAvailable()).count();
	}

	public List<Inventory> getAvailableInventory() {
		return inventory.stream().filter(i -> i.isAvailable()).collect(Collectors.toList());
	}

	public long getNumberOfUnavailableInventory() {
		return inventory.stream().filter(i -> !i.isAvailable()).count();
	}

	public List<Inventory> getUnvailableInventory() {
		return inventory.stream().filter(i -> !i.isAvailable()).collect(Collectors.toList());
	}

	public long getNumberOfInventory() {
		return inventory.size();
	}

	public List<Inventory> getInventory() {
		return inventory.stream().collect(Collectors.toList());
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public double getDailyFine() {
		return dailyFine;
	}

	public void setDailyFine(double dailyFine) {
		this.dailyFine = dailyFine;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
