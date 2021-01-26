package CoffeeServiceManagement;

public class Product { 
	
	//bu class'in amaci tamamiyle kampanyalari stoklamak, düzenlemek, kontrol etmek
	
	private int id; //kampanya id  0, 1, 2 þeklinde girildigi kabul ediliyor
	String name; //kampanya adi
	
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
