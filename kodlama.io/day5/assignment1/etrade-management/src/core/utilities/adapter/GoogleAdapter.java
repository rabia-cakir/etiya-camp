package core.utilities.adapter;

import googleService.Google;

public class GoogleAdapter implements CheckIfMailExistsService{
    @Override
    public void checkIfMailExists(String gmail) {
        Google google=new Google();
        google.checkIfGmailExists(gmail);
    }
}
