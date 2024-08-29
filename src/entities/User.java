package entities;

import java.util.List;

public class User {
    private String name;
    private int age;
    private String id;
    private List<Carbon> carbons;

    // Constructors, getters, and setters
    public User(String name, int age, String id, List<Carbon> carbons) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.carbons = carbons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Carbon> getCarbons() {
        return carbons;
    }

    public void setCarbons(List<Carbon> carbons) {
        this.carbons = carbons;
    }

    public int calculateTotalCarbonConsumption() {
        return carbons.stream().mapToInt(Carbon::getCarbonConsumption).sum();
    }
}
