package decorators;

import businessmodels.Product;

public abstract class ProductDecorator extends Product {

	protected Product baseProduct;

	public ProductDecorator(Product baseProduct) {
		super(baseProduct.getProductId(), baseProduct.getDailyRate(), baseProduct.getDailyFine());
		this.baseProduct = baseProduct;
	}

}
