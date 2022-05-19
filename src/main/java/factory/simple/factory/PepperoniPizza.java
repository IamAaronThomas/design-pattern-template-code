package factory.simple.factory;

/**
 * 意大利辣香肠披萨
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "意大利辣香肠披萨";
        dough = "脆皮";
        sauce = "意大利西红柿酱";
        toppings.add("意大利辣香肠片");
        toppings.add("洋葱片");
        toppings.add("磨碎的帕尔马干酪");
    }
}
