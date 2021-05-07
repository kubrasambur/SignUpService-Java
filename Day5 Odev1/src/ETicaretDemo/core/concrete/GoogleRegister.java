package ETicaretDemo.core.concrete;

import ETicaretDemo.core.abstracts.SignupService;

public class GoogleRegister implements SignupService{

	
	
	@Override
    public void registerSystem(String email, String password) {
        System.out.println("Google Ýle kayýt olundu: " + email);

    }

    @Override
    public void loginSystem(String email, String password) {
        System.out.println("Google Ýle Giriþ yapildi: " + email);

    }

}
