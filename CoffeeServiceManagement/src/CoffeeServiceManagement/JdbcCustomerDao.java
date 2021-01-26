package CoffeeServiceManagement;

public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("Müsteri JDBC ile eklendi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("Müsteri JDBC ile güncellendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("Müsteri JDBC ile silindi.");
		System.out.println();
	}

	@Override
	public void verify() {
		System.out.println("Müsteri JDBC ile dogrulandi.");
		System.out.println();
	}

}
