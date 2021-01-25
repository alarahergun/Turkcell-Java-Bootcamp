package CoffeeServiceManagement;

public class Nero extends ServiceManager{

	public Nero(ShopService shopService, ProductService productService, CustomerService customerService) {
		super(shopService, productService, customerService);
		// TODO Auto-generated constructor stub
	}

	/*her maðazanýn kendine ait bir service manager sistemi var
	 * bu sayede ileride herhangi bir maðaza herhangi bir konuda
	 * ek bir hizmet isterse kolayca eklenip çýkarýlabilir
	 */
	
	//Nero ek bir hizmet istemedi, service manager'daki default servisler onun için yeterli
	
}
