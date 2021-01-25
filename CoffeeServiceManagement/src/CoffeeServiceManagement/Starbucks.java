package CoffeeServiceManagement;

public class Starbucks{
	
	StarbucksCustomerService starbucksCustomerService;
	ShopService shopService;
	ProductService productService;
	
	public Starbucks(StarbucksCustomerService starbucksCustomerService, ShopService shopService,
			ProductService productService) {
		super();
		this.starbucksCustomerService = starbucksCustomerService;
		this.shopService = shopService;
		this.productService = productService;
	}
	
	
	/*her mağazanın kendine ait bir service manager sistemi var
	 * bu sayede ileride herhangi bir mağaza herhangi bir konuda
	 * ek bir hizmet isterse kolayca eklenip çıkarılabilir
	 */
}
