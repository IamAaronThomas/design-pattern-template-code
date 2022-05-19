package factory.factory.method;

/**
 * 芝加哥风味芝士披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "芝加哥风味深盘芝士披萨";
        dough = "超厚皮面团";
        sauce = "梅子番茄酱";

        toppings.add("马苏里拉芝士丝");
    }

    void cut() {
        System.out.println("将披萨切成方形片");
    }
}
