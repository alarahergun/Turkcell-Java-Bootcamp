package CoffeeServiceManagement;

public class ServiceManager {
	
	/* Bir ma�aza ekstra bir hizmet istemedi�i taktirde bu hizmet kullan�lacak
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