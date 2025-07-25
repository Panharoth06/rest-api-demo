package co.istad.restapi;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getUsers();
    User getUserById(int id);
}
