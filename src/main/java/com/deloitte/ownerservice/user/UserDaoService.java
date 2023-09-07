package com.deloitte.ownerservice.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class  UserDaoService {

    // JPA/Hibernate will communicate with DB
    // UserDaoService > Static List

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Paula", LocalDate.now().minusYears(24)));
        users.add(new User(++usersCount, "Cesar", LocalDate.now().minusYears(27)));
        users.add(new User(++usersCount, "Maru", LocalDate.now().minusYears(62)));
    }

    public List<User> findAll(){
        return users;
    }
    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
