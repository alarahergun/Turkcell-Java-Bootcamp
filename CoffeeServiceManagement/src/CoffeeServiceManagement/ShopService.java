package CoffeeServiceManagement;

public class ShopService {
	
	IKampanya kampanya;

	public ShopService(IKampanya kampanya) {
		this.kampanya = kampanya;
	}
	
	public ShopService()
	{
		//kampanya olmamasi durumu
	}

	public void satisYap(Customer customer, Product product) 
	{
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adli müsteriye " + product.getName() + " kampanyasi kapsaminda ürün satilmistir.");
		kampanya.satis();
	}
	
	public void satisYap(Customer customer)
	{
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adli müsteriye ürün satilmistir.");
	}
	
}
