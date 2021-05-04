public class Main {

	public static void main(String[] args) {
		Customer goktug = new Customer();
		goktug.setBirthDay(18,06,2005);
		goktug.setId(1);
		goktug.setFirstName("Göktuð Furkan");
		goktug.setLastName("Arýca");
		goktug.setNationalIdentity("12345678901");
		
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisRealPersonChecker());
		
		starbucksCustomerManager.saveToDatabase(goktug);
		neroCustomerManager.saveToDatabase(goktug);
	}

}
