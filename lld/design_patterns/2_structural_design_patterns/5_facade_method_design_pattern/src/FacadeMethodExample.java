import restaurant.facade.RestaurantKeeper;
import restaurant.facade.RestaurantKeeperImpl;
import restaurant.menu.BothMenu;
import restaurant.menu.NonVegMenu;
import restaurant.menu.VegMenu;

public class FacadeMethodExample {
    public static void main(String[] args) {
        RestaurantKeeper restaurantKeeper = new RestaurantKeeperImpl();

        VegMenu vegMenu = restaurantKeeper.getVegMenu();
        NonVegMenu nonVegMenu = restaurantKeeper.getNonVegMenu();
        BothMenu bothMenu = restaurantKeeper.getBothMenu();
    }
}