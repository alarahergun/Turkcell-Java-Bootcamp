package CoffeeServiceManagement;

public class ServiceManager {
	
	/* Bir maðaza ekstra bir hizmet istemediði taktirde bu hizmet kullanýlacak
	 * default olarak
	 */
	
	ShopService shopService;
	ProductService productService;
	CustomerService customerService;
	
	public ServiceManager(ShopService shopService, ProductService productService, CustomerService customerService) {
		super();
		this.shopService = shopService;
		this.productService = productService;
		this.customerService = customerService;
	}	
}