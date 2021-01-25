package CoffeeServiceManagement;

import java.util.ArrayList;

public class ProductService {
	
	IProductDao productDao;
	ArrayList <Product> products = new ArrayList<Product>();
	
	public ProductService(IProductDao productDao){
		this.productDao = productDao; 
	}
	
	public void add(Product product) {
		if(products.size() == 0)
		{
			System.out.println("Business kodu : Add");
			products.add(product);
			productDao.add();
		}
		else if(!products.contains(product))
		{
			System.out.println("Business kodu : Add");
			products.add(product);
			productDao.add();
		}
		else 
		{
			System.out.println("Kampanya sisteme �oktan kay�tl�.");
		}
	}
	
	public void update(Product product) 
	{
		System.out.println("Business kodu : G�ncelle");
		productDao.update();
	}
	
	public void delete(Product product) 
	{
		if(!products.contains(product))
		{
			System.out.println("Kampanya sisteme kay�tl� de�il.");
		}
		else 
		{
			System.out.println("Business kodu : Delete");
			products.remove(product.getId());
			productDao.delete();
		}
	}
	
	
}
