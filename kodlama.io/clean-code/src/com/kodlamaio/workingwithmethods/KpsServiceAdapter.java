package com.kodlamaio.workingwithmethods;

import com.kodlamaio.mernisreference.MBPKPSPublicSoap;

public class KpsServiceAdapter implements IPersonService{
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
