package controllers;

import entities.Carbon;
import entities.User;
import services.UserService;

import java.util.Date;
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

    public void addCarbonConsumptionForUser(String id, int consumption, Date startDate, Date endDate) {
        User user = userService.findUserById(id);
        if(user == null){
            System.out.println("User not found with id:" + id);
            return;
        }
        Carbon carbon = new Carbon(user, consumption, startDate, endDate);
        user.getCarbons().add(carbon);
    }


    public void displayAllCarbonsForUser(String id) {
        User user = userService.findUserById(id);
        if(user == null){
            System.out.println("User not found with id:" + id);
            return;
        }
        List<Carbon> carbons = userService.getCarbonConsumptionByUser(user);
        carbons.forEach(carbon -> {
            System.out.println("User : " + carbon.getUser().getName());
            System.out.println("User consumption: " + carbon.getCarbonConsumption());
            System.out.println("Start Date: " + carbon.getStartDate());
            System.out.println("End Date: " + carbon.getEndDate());
        });
    }
}
