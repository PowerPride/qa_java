import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenAple = new Apple(8, 60, Colour.GREEN);
        Food[] foods = {meat, redApple, greenAple};

        ShoppingCart card = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: " + card.getPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + card.getPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки%: "+ card.getPriceWithAllVeganDishesWithoutDiscount());
    }
}
