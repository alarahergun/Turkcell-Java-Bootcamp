package CoffeeServiceManagement;

public class Customer {

	private int id; //müşteriye özel id  0, 1, 2 þeklinde girildiği kabul ediliyor
	String tcNo; // tc no string şeklinde harf vb gelme ihtimali için
	String firstName;
	String lastName;
	int dogumYili;
	
	
	public Customer(int id, String tcNo, String firstName, String lastName, int dogumYili) {
		this.id = id;
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dogumYili = dogumYili;
	}
	
	public Customer() { 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettcNo() {
		return tcNo;
	}

	public void setTCNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
}
