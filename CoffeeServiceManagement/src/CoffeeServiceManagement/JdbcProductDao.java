package CoffeeServiceManagement;

public class JdbcProductDao implements IProductDao{

	@Override
	public void add() {
		System.out.println("Kampanya JDBC ile eklendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("Kampanya JDBC ile silindi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("Kampanya JDBC ile güncellendi.");
		System.out.println();
	}

}
