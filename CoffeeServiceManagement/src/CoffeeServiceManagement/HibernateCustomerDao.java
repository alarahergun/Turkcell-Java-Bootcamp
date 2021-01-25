package CoffeeServiceManagement;

public class HibernateCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("M��teri Hibernate ile eklendi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("M��teri Hibernate ile g�ncellendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("M��teri Hibernate ile silindi.");
		System.out.println();
	}

	@Override
	public void verify() {
		System.out.println("M��teri Hibernate ile do�ruland�.");
		System.out.println();
	}
}
