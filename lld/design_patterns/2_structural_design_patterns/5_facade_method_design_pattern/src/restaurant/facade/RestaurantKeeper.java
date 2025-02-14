package restaurant.facade;

import restaurant.menu.BothMenu;
import restaurant.menu.NonVegMenu;
import restaurant.menu.VegMenu;

public interface RestaurantKeeper {

    public VegMenu getVegMenu();

    public NonVegMenu getNonVegMenu();

    public BothMenu getBothMenu();
}
