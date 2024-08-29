
package services;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public void createUser(String name, int age, String id) {
        User user = new User(name, age, id, new ArrayList<>());
        users.add(user);
    }

    public void updateUser(String id, String newName, int newAge) {
        User user = findUserById(id);
        if (user != null) {
            user.setName(newName);
            user.setAge(newAge);
        }
    }

    public void deleteUser(String id) {
        User user = findUserById(id);
        if (user != null) {
            users.remove(user);
        }
    }

    public User findUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
