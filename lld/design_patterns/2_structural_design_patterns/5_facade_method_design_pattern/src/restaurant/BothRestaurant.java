package restaurant;

import restaurant.menu.BothMenu;
import restaurant.menu.Menu;

public class BothRestaurant implements Restaurant{
    @Override
    public Menu getMenu() {
        System.out.println("[BothRestaurant] Creating BothMenu");
        BothMenu b = new BothMenu();
        return b;
    }
}
