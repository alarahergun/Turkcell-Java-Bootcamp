package CoffeeServiceManagement;

public class ShopService {
	
	IKampanya kampanya;

	public ShopService(IKampanya kampanya) {
		this.kampanya = kampanya;
	}
	
	public ShopService()
	{
		//kampanya olmamasý durumu
	}

	public void satisYap(Customer customer, Product product) 
	{
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý müþteriye " + product.getName() + " kampanyasý kapsamýnda ürün satýlmýþtýr.");
		kampanya.satis();
	}
	
	public void satisYap(Customer customer)
	{
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý müþteriye ürün satýlmýþtýr.");
	}
	
}