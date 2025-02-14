package restaurant;

import restaurant.menu.Menu;
import restaurant.menu.VegMenu;

public class VegRestaurant implements Restaurant {
    @Override
    public Menu getMenu() {
        System.out.println("[VegRestaurant] Creating VegMenu");
        VegMenu v = new VegMenu();
        return v;
    }
}
