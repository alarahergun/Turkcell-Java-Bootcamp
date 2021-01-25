package CoffeeServiceManagement;

public class Product { 
	
	//bu class'ýn amacý tamamiyle kampanyalarý stoklamak, düzenlemek, kontrol etmek
	
	private int id; //kampanya id  0, 1, 2 þeklinde girildiði kabul ediliyor
	String name; //kampanya adý
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Product(){
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
