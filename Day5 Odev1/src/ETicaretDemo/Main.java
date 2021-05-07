package ETicaretDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ETicaretDemo.business.concrete.EmailValidateManager;
import ETicaretDemo.business.concrete.UserManager;
import ETicaretDemo.core.abstracts.SignupService;
import ETicaretDemo.core.concrete.GoogleRegister;
import ETicaretDemo.dataAccess.concrete.HibernateUserDao;
import ETicaretDemo.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("Kübra", "Sambur", "kubra@gmail.com", "123456");
		
		Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(user.getEposta());
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	    UserManager userManager = new UserManager(new HibernateUserDao(), new EmailValidateManager());
	    userManager.login(user);
	     
	    SignupService googleRegister= new GoogleRegister();
	    googleRegister.loginSystem("123@gmail.com", "123");
	    
	  }
	}


