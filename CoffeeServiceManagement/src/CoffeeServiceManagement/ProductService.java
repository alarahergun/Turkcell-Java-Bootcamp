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
			System.out.println("Kampanya sisteme çoktan kayitli.");
		}
	}
	
	public void update(Product product) 
	{
		System.out.println("Business kodu : Güncelle");
		productDao.update();
	}
	
	public void delete(Product product) 
	{
		if(!products.contains(product))
		{
			System.out.println("Kampanya sisteme kayitli degil.");
		}
		else 
		{
			System.out.println("Business kodu : Delete");
			products.remove(product.getId());
			productDao.delete();
		}
	}
	
	
}
