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
	
	
	/*her maðazanýn kendine ait bir service manager sistemi var
	 * bu sayede ileride herhangi bir maðaza herhangi bir konuda
	 * ek bir hizmet isterse kolayca eklenip çýkarýlabilir
	 */
}
