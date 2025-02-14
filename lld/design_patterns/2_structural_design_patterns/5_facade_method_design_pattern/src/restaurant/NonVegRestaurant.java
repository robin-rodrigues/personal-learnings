package restaurant;

import restaurant.menu.Menu;
import restaurant.menu.NonVegMenu;

public class NonVegRestaurant implements Restaurant{
    @Override
    public Menu getMenu() {
        System.out.println("[NonVegRestaurant] Creating NonVegMenu");
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
