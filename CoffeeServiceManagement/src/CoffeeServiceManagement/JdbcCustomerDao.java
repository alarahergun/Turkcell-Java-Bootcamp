package CoffeeServiceManagement;

public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("Müþteri JDBC ile eklendi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("Müþteri JDBC ile güncellendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("Müþteri JDBC ile silindi.");
		System.out.println();
	}

	@Override
	public void verify() {
		System.out.println("Müþteri JDBC ile doðrulandý.");
		System.out.println();
	}

}