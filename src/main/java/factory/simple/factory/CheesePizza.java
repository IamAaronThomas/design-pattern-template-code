package factory.simple.factory;

/**
 * 芝士披萨
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "芝士披萨";
        dough = "正常脆皮";
        sauce = "马丽娜拉披萨酱";
        toppings.add("新鲜马苏里拉");
        toppings.add("帕尔马干酪");
    }
}
