package entities;

import java.util.Date;

public class Carbon {
    private User user;
    private int carbonConsumption;
    private Date startDate;
    private Date endDate;

    // Constructors, getters, and setters
    public Carbon(User user, int carbonConsumption, Date startDate, Date endDate) {
        this.user = user;
        this.carbonConsumption = carbonConsumption;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCarbonConsumption() {
        return carbonConsumption;
    }

    public void setCarbonConsumption(int carbonConsumption) {
        this.carbonConsumption = carbonConsumption;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
