package CoffeeServiceManagement;

public class ShopService {
	
	IKampanya kampanya;

	public ShopService(IKampanya kampanya) {
		this.kampanya = kampanya;
	}
	
	public ShopService()
	{
		//kampanya olmamas� durumu
	}

	public void satisYap(Customer customer, Product product) 
	{
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adl� m��teriye " + product.getName() + " kampanyas� kapsam�nda �r�n sat�lm��t�r.");
		kampanya.satis();
	}
	
	public void satisYap(Customer customer)
	{
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adl� m��teriye �r�n sat�lm��t�r.");
	}
	
}