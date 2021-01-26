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
	
	
	/*her magazanin kendine ait bir service manager sistemi var (istenirse olmayabilir de)
 	 * bu sayede ileride herhangi bir magaza herhangi bir konuda
	 * ek bir hizmet isterse kolayca eklenip çikarilabilir
	 */
}
