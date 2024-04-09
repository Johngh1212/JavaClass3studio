package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class DrinkMenu {
    private Menu drinkMenu;

    public DrinkMenu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.drinkMenu = new Menu(lastUpdated, items);
    }

    public Menu getDrinkMenu() {
        return drinkMenu;
    }

    public void setDrinkMenu(Menu drinkMenu) {
        this.drinkMenu = drinkMenu;
    }
}

