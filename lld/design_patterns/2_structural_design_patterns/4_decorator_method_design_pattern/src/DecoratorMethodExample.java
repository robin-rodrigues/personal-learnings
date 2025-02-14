import pizza.BasePizza;
import pizza.FarmhousePizza;
import pizza.MargheritaPizza;
import toppings.ExtraCheese;
import toppings.Mushroom;

public class DecoratorMethodExample {
    public static void main(String[] args) {
        BasePizza margheritaPizza = new MargheritaPizza();
        BasePizza margheritaPizzaWithToppings = new Mushroom(new ExtraCheese(new MargheritaPizza()));
        BasePizza farmhousePizza = new FarmhousePizza();
        BasePizza farmhousePizzaWithToppings = new Mushroom(new ExtraCheese(new FarmhousePizza()));

        System.out.println("Cost of Margherita Pizza: " + margheritaPizza.cost());
        System.out.println("Cost of Margherita Pizza with 2 toppings: " + margheritaPizzaWithToppings.cost());
        System.out.println("Cost of Farmhouse Pizza: " + farmhousePizza.cost());
        System.out.println("Cost of Farmhouse Pizza with 2 toppings: " + farmhousePizzaWithToppings.cost());
    }
}