package CoffeeServiceManagement;

public class ServiceManager {
	
	/* Bir magaza ekstra bir hizmet istemedigi taktirde bu hizmet kullanilacak
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
