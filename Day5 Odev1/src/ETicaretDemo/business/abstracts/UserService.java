package ETicaretDemo.business.abstracts;

import java.util.List;

import ETicaretDemo.entities.concrete.User;

public interface UserService {
	void signup(User user);
	void login(User user);
	List<User> getAll();
}
