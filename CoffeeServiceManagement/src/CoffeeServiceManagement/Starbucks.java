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
	
	
	/*her ma�azan�n kendine ait bir service manager sistemi var
	 * bu sayede ileride herhangi bir ma�aza herhangi bir konuda
	 * ek bir hizmet isterse kolayca eklenip ��kar�labilir
	 */
}
