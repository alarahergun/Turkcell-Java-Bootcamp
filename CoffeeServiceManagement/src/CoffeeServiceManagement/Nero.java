package CoffeeServiceManagement;

public class Nero extends ServiceManager{

	public Nero(ShopService shopService, ProductService productService, CustomerService customerService) {
		super(shopService, productService, customerService);
		// TODO Auto-generated constructor stub
	}

	/*her ma�azan�n kendine ait bir service manager sistemi var
	 * bu sayede ileride herhangi bir ma�aza herhangi bir konuda
	 * ek bir hizmet isterse kolayca eklenip ��kar�labilir
	 */
	
	//Nero ek bir hizmet istemedi, service manager'daki default servisler onun i�in yeterli
	
}
