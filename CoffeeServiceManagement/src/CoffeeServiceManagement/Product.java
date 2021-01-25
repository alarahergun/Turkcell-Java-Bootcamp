package CoffeeServiceManagement;

public class Product { 
	
	//bu class'�n amac� tamamiyle kampanyalar� stoklamak, d�zenlemek, kontrol etmek
	
	private int id; //kampanya id  0, 1, 2 �eklinde girildi�i kabul ediliyor
	String name; //kampanya ad�
	
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
