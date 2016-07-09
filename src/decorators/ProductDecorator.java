package decorators;

import businessmodels.Product;

public abstract class ProductDecorator extends Product {

	protected Product baseProduct;

	public ProductDecorator(Product baseProduct) {
		super(baseProduct.getTitle(), baseProduct.getProductId(), baseProduct.getDailyRate(), baseProduct.getDailyFine(), baseProduct.getBorrowDuration());
		this.baseProduct = baseProduct;
	}

}
