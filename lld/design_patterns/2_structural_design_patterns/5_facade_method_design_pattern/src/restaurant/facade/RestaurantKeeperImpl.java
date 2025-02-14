package restaurant.facade;

import restaurant.BothRestaurant;
import restaurant.NonVegRestaurant;
import restaurant.VegRestaurant;
import restaurant.menu.BothMenu;
import restaurant.menu.NonVegMenu;
import restaurant.menu.VegMenu;

public class RestaurantKeeperImpl implements RestaurantKeeper {

    @Override
    public VegMenu getVegMenu() {
        System.out.println("[RestaurantKeeperImpl] Going to fetch VegMenu from VegRestaurant");
        VegRestaurant vegRestaurant = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenu();
        return vegMenu;
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        System.out.println("[RestaurantKeeperImpl] Going to fetch NonVegMenu from NonVegRestaurant");
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegRestaurant.getMenu();
        return nonVegMenu;
    }

    @Override
    public BothMenu getBothMenu() {
        System.out.println("[RestaurantKeeperImpl] Going to fetch BothMenu from BothRestaurant");
        BothRestaurant bothRestaurant = new BothRestaurant();
        BothMenu bothMenu = (BothMenu) bothRestaurant.getMenu();
        return bothMenu;
    }
}
