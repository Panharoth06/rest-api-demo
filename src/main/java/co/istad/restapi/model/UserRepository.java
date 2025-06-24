package co.istad.restapi.model;

import co.istad.restapi.inMemoryDatabase.UserDatabase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final UserDatabase userDatabase;

    public List<User> getAllUsers() {
        return userDatabase.users;
    }

    public User getUserById(int id) {
        return userDatabase.users
                .stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User addUser(User user) {
        userDatabase.users.add(user);
        return user;
    }
}
