package factory.simple.factory;

/**
 * 蛤蜊披萨
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "蛤蜊披萨";
        dough = "薄壳";
        sauce = "白蒜酱";
        toppings.add("蛤蜊");
        toppings.add("磨碎的帕尔马干酪");
    }
}
