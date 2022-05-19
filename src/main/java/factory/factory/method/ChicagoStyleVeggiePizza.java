package factory.factory.method;

/**
 * 芝加哥风味素食比萨
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "芝加哥风味素食比萨";
        dough = "超厚皮面团";
        sauce = "梅子番茄酱";

        toppings.add("马苏里拉芝士丝");
        toppings.add("黑橄榄");
        toppings.add("菠菜");
        toppings.add("茄子");
    }

    void cut() {
        System.out.println("将披萨切成方形片");
    }
}
