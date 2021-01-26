package CoffeeServiceManagement;

public class HibernateCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("Müsteri Hibernate ile eklendi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("Müsteri Hibernate ile güncellendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("Müsteri Hibernate ile silindi.");
		System.out.println();
	}

	@Override
	public void verify() {
		System.out.println("Müsteri Hibernate ile dogrulandi.");
		System.out.println();
	}
}
