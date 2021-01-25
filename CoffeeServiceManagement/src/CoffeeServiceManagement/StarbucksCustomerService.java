package CoffeeServiceManagement;

public class StarbucksCustomerService extends CustomerService{
	
	public StarbucksCustomerService(ICustomerDao customerDao) {
		super(customerDao);
	}

	public void verify(Customer customer)
	{
		//E-devlet ile ilgili i�lemler
		System.out.println("E-devlet sisteminden TC, Ad, Soyad, Do�um Y�l� do�rulama yap�l�yor...");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adl� m��teri e-devlet taramas�ndan ge�ti.");
		customerDao.verify();
	}
	
}
