package co.istad.restapi.inMemoryDatabase;

import co.istad.restapi.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDatabase {
    public List<User> users = new ArrayList<>(
            List.of(
                    new User(1, "Dara01", "dara@gmail.com", "dara!@#$", "1.png"),
                    new User(2, "Koko", "koko@gmail.com", "Koko!@$%^$&", "2.png")
            )
    );
}
