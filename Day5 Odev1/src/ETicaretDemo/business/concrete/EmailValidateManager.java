package ETicaretDemo.business.concrete;

import ETicaretDemo.business.abstracts.EmailValidateService;
import ETicaretDemo.entities.concrete.User;

public class EmailValidateManager implements EmailValidateService{

	@Override
	public void validate(User user) {
		System.out.println("Do�rulama linki yolland� : " + user.getEposta());
		
	}

} 
