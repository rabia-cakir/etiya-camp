package com.kodlamaio.layeredarchitecture.business.serviceadapters;

import com.kodlamaio.layeredarchitecture.business.abstracts.IPersonService;
import com.kodlamaio.layeredarchitecture.entity.concretes.Person;
import com.kodlamaio.mernisreference.MBPKPSPublicSoap;


public class KpsServiceAdapter implements IPersonService {
    @Override
    public boolean checkPerson(Person person) throws Exception {
        MBPKPSPublicSoap client=new MBPKPSPublicSoap();
        boolean result=client.TCKimlikNoDogrula(Long.parseLong(person.identityNumber),
                person.firstName,
                person.lastName,
                person.yearOfBirth);

        return result;
    }
}
