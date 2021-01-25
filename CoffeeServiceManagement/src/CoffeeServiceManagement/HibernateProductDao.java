package CoffeeServiceManagement;

public class HibernateProductDao implements IProductDao{

	@Override
	public void add() {
		System.out.println("Kampanya Hibernate ile eklendi.");
		System.out.println();
	}

	@Override
	public void delete() {
		System.out.println("Kampanya Hibernate ile silindi.");
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("Kampanya Hibernate ile güncellendi.");
		System.out.println();
	}

}
