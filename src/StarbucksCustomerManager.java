public class StarbucksCustomerManager extends CustomerManager{

    public StarbucksCustomerManager(IRealPersonChecker iRealPersonChecker) {
        this.iRealPersonChecker = iRealPersonChecker;
    }

    IRealPersonChecker iRealPersonChecker;

    @Override
    public void saveToDatabase(Customer customer) {
        if(iRealPersonChecker.checkRealPerson(customer)){
            super.saveToDatabase(customer);
            System.out.println("Ki�i Do�ruland�. Sisteme kaydedildi.");
        }else{
            System.out.println("Ki�i Do�rulanamad�. Sisteme kaydedilmedi.");
        }

    }
}
