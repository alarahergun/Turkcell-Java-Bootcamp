package CoffeeServiceManagement;

import java.util.ArrayList;

public class CustomerService {
	
	ICustomerDao customerDao;
	ArrayList <Customer> customers = new ArrayList<Customer>();
	
	public CustomerService(ICustomerDao customerDao) 
	{
		this.customerDao = customerDao;
	}
		
	public void add(Customer customer)
	{	
		if(customers.size() == 0)
			{
				System.out.println("Business kodu : Add");
				customers.add(customer);
				customerDao.add();
			}
		else if(!customers.contains(customer))
			{
				System.out.println("Business kodu : Add");
				customers.add(customer);
				customerDao.add();
			}
		else 
			{
				System.out.println("Müşteri sisteme çoktan kayıtlı.");
			}
	}
		
	public void update(Customer customer) 
	{
		System.out.println("Business kodu : Güncelle");
		customerDao.update();
	}
	
	public void delete(Customer customer) 
	{
		if(!customers.contains(customer))
		{
			System.out.println("Müşteri sisteme kayıtlı değil.");
		}
		else 
		{
			System.out.println("Business kodu : Delete");
			customers.remove(customer.getId());
			customerDao.delete();
		}
	}
}
