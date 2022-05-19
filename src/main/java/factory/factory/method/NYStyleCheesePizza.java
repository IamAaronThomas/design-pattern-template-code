package factory.factory.method;

/**
 * 纽约风味酱奶酪披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "纽约风味酱奶酪披萨";
        dough = "薄皮面团";
        sauce = "意大利西红柿酱";

        toppings.add("磨碎的雷吉亚诺奶酪");
    }
}
