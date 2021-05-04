public abstract class CustomerManager implements ICustomerService{

    @Override
    public void saveToDatabase(Customer customer) {
        System.out.println(customer.getFirstName() + " Database'e kaydedildi.");
    }
}
