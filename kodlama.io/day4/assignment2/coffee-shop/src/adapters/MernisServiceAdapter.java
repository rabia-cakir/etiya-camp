package adapters;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import mernisReference.CGCKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        CGCKPSPublicSoap client=new CGCKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
                customer.getLastName(),customer.getDateOfBirth().getYear());
    }
}
