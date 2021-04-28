package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kayýt Baþarýlý !!!");
	}
	
	public void addMultiple(Customer[] customer) {
		for (Customer customer2 : customer) {
			add(customer2);
		}
	}
}
//polymorphism - çok biçimlilik

		// SOLID - O = Open Closed Principle -- sisteme yeni özellik eklendiðinde hiç
		// bir kodu deðiþtiremezsin sadece sisteme özellik eklersin