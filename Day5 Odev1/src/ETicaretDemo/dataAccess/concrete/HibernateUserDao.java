package ETicaretDemo.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import ETicaretDemo.dataAccess.abstracts.UserDao;
import ETicaretDemo.entities.concrete.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	public void register(User user) {
        System.out.println("Kayýt Basarili" + user.getFirstName());
       

    }

    @Override
    public void login(User user) {

        System.out.println("Giris Basarili: "+ user.getFirstName());
    }

    @Override
    public List<User> getAll() {

        return users;
    }



}
