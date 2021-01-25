package CoffeeServiceManagement;

public class HibernateCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("Müþteri Hibernate ile eklendi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("Müþteri Hibernate ile güncellendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("Müþteri Hibernate ile silindi.");
		System.out.println();
	}

	@Override
	public void verify() {
		System.out.println("Müþteri Hibernate ile doðrulandý.");
		System.out.println();
	}
}
