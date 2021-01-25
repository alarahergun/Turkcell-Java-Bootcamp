package CoffeeServiceManagement;

public class StarbucksCustomerService extends CustomerService{
	
	public StarbucksCustomerService(ICustomerDao customerDao) {
		super(customerDao);
	}

	public void verify(Customer customer)
	{
		//E-devlet ile ilgili iþlemler
		System.out.println("E-devlet sisteminden TC, Ad, Soyad, Doðum Yýlý doðrulama yapýlýyor...");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý müþteri e-devlet taramasýndan geçti.");
		customerDao.verify();
	}
	
}
