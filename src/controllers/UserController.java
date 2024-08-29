package controllers;

import entities.User;
import services.UserService;

import java.util.List;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public void createUser(String name, int age, String id) {
        userService.createUser(name, age, id);
    }

    public void updateUser(String id, String newName, int newAge) {
        userService.updateUser(id, newName, newAge);
    }

    public void deleteUser(String id) {
        userService.deleteUser(id);
    }

    public void displayAllUsers() {
        List<User> users = userService.getAllUsers();
        users.forEach(user -> {
            System.out.println("User ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
        });
    }
}
