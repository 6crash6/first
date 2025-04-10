import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApples, greenApples};
        ShoppingCart shoppingCart = new ShoppingCart(items);


        System.out.printf("Общая сумма товаров без скидки: %.2f%n", shoppingCart.WithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f%n", shoppingCart.WithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f%n", shoppingCart.TotalVegetarian());
    }
}
