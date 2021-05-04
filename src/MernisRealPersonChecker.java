import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.*;
public class MernisRealPersonChecker implements IRealPersonChecker{

	@Override
	public boolean checkRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean control=false;
		
			
		try {
			control=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDay().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return control;
	}
}
