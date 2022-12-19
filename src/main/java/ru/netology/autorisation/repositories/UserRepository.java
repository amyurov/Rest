package ru.netology.autorisation.repositories;

import org.springframework.stereotype.Repository;
import ru.netology.autorisation.entities.User;
import ru.netology.autorisation.enums.Authorities;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    // Храним юзеров и их разрешения в мапе
    final private ConcurrentHashMap<User, List<Authorities>> users;

    public UserRepository() {
        this.users = new ConcurrentHashMap<>();
        usersInit();
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        User targetUser = new User(user, password);

        if (!users.containsKey(targetUser)) {
            return Collections.emptyList();
        }
        return users.get(targetUser);
    }

    public void usersInit() {
        users.put(new User("admin", "admin"), List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
        users.put(new User("moder", "moder"), List.of(Authorities.READ, Authorities.WRITE));
        users.put(new User("user", "user"), List.of(Authorities.READ));
    }
}
