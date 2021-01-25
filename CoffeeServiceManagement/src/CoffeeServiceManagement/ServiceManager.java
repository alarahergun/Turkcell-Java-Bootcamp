package CoffeeServiceManagement;

public class ServiceManager {
	
	/* Bir mağaza ekstra bir hizmet istemediği taktirde bu hizmet kullanılacak
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