package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer abdullah = new IndividualCustomer();
		abdullah.customerNumber="123";
		
		CorporateCustomer ctn = new CorporateCustomer();
		ctn.customerNumber="456";
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(ctn);
		customerManager.add(abdullah);
		
		
		Customer[] customer = {ctn,abdullah};
		
		customerManager.addMultiple(customer);
	}

}
