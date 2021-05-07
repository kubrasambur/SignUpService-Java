package ETicaretDemo.dataAccess.abstracts;

import java.util.List;

import ETicaretDemo.entities.concrete.User;

public interface UserDao {
	
	void register(User user);
	void login(User user);
	
	
	List<User> getAll();
}
