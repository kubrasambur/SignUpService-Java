package ETicaretDemo.core.concrete;

import ETicaretDemo.core.abstracts.SignupService;

public class GoogleRegister implements SignupService{

	
	
	@Override
    public void registerSystem(String email, String password) {
        System.out.println("Google �le kay�t olundu: " + email);

    }

    @Override
    public void loginSystem(String email, String password) {
        System.out.println("Google �le Giri� yapildi: " + email);

    }

}
