package services;

import entities.Carbon;
import entities.User;

import java.util.Date;
import java.util.List;

public class CarbonService {

    public void addCarbonConsumption(User user, int consumption, Date startDate, Date endDate) {
        Carbon carbon = new Carbon(user, consumption, startDate, endDate);
        user.getCarbons().add(carbon);
    }

    public List<Carbon> getCarbonConsumptionByUser(User user) {
        return user.getCarbons();
    }

    public int calculateTotalCarbonConsumption(User user) {
        return user.calculateTotalCarbonConsumption();
    }
}

