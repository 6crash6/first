package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double WithoutDiscount() {
        double total = 0;
        for (Food product : products) {
            total += product.getAmount() * product.getPrice();
        }
        return total;
    }

    public double WithDiscount() {
        double total = 0;

        for (Food product : products) {
            double discount = product instanceof Discountable ? product.getDiscount() : 0;
            total += product.getAmount() * product.getPrice() * (1 - discount / 100);
        }
        return total;
    }

    public double TotalVegetarian() {
        double total = 0;
        for (Food product : products) {
            if (product.isVegetarian()) {
                total += product.getAmount() * product.getPrice();
            }
        }
        return total;
    }
}
