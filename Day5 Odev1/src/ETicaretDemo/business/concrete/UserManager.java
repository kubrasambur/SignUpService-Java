package ETicaretDemo.business.concrete;

import java.util.List;

import ETicaretDemo.business.abstracts.UserService;
import ETicaretDemo.dataAccess.concrete.HibernateUserDao;
import ETicaretDemo.entities.concrete.User;

public class UserManager implements UserService{

	private HibernateUserDao userDao;
	private EmailValidateManager emailValidate;
	
	public UserManager() {
		
	}
	
	public UserManager(HibernateUserDao userDao, EmailValidateManager emailValidate) {
		this.userDao = userDao;
		this.emailValidate = emailValidate;
		
	}

	@Override
	public void signup(User user) {
		if(user.getEposta()==null || user.getFirstName()==null || user.getLastName()==null || user.getPassword()==null) {
			System.out.println("lütfen  boþ alanlarý doldurunuz.");
			return;
		}else if(user.getPassword().length()<6) {
			System.out.println("þifreniz 6 karakterden küçük olamaz.");
		}else if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("adýnýz veya soyadýnýz 2 karakterden küçük olamaz. ");
		}else {
			System.out.println("kullanýcý eklendi.");
			emailValidate.validate(user);
		} 
		
	}
	
	
	@Override
	public void login(User user) {
		if(user.getEposta()=="kubra@gmail.com" && user.getPassword()=="123456") {
			userDao.login(user);
		}else {
			System.out.println("þifre veya kullanýcý adý yanlýþ");
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
