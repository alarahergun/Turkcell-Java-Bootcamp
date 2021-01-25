package CoffeeServiceManagement;

public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("M��teri JDBC ile eklendi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("M��teri JDBC ile g�ncellendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("M��teri JDBC ile silindi.");
		System.out.println();
	}

	@Override
	public void verify() {
		System.out.println("M��teri JDBC ile do�ruland�.");
		System.out.println();
	}

}