package CoffeeServiceManagement;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new CustomerStarbucks();
		customer1.setDogumYili(2000);
		customer1.setFirstName("Alara");
		customer1.setLastName("Hergun");
		customer1.setId(0);
		customer1.setTCNo("1237182312");
		
		Customer customer2 = new CustomerNero();
		customer2.setDogumYili(2000);
		customer2.setFirstName("Ayse");
		customer2.setLastName("Yilmaz");
		customer2.setId(1);
		customer2.setTCNo("1373981273");
		
		Product product1 = new Product();
		product1.setId(0);
		product1.setName("YildizKampanyasi");
		
		Starbucks starbucks = new Starbucks(new StarbucksCustomerService(new HibernateCustomerDao()), new ShopService(new YildizKampanyasi()), new ProductService(new HibernateProductDao()));
		
		Nero nero = new Nero(new ShopService(), new ProductService(new HibernateProductDao()), new CustomerService(new HibernateCustomerDao()));
		
		starbucks.starbucksCustomerService.add(customer2);
		starbucks.productService.add(product1);
		starbucks.starbucksCustomerService.verify(customer2);
		
		starbucks.shopService.satisYap(customer2, product1);
		
		nero.customerService.add(customer2);
		nero.shopService.satisYap(customer2);
		
	}

}
