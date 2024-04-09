package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class FoodMenu {
    private Menu foodMenu;

    public FoodMenu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.foodMenu = new Menu(lastUpdated, items);
    }

    public Menu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(Menu foodMenu) {
        this.foodMenu = foodMenu;
    }
}

