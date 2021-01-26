package CoffeeServiceManagement;

public class StarbucksCustomerService extends CustomerService{
	
	public StarbucksCustomerService(ICustomerDao customerDao) {
		super(customerDao);
	}

	public void verify(Customer customer)
	{
		//E-devlet ile ilgili işlemler
		System.out.println("E-devlet sisteminden TC, Ad, Soyad, Dogum Yili dogrulama yapiliyor...");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adli müsteri e-devlet taramasindan geçti.");
		customerDao.verify();
	}
	
}
