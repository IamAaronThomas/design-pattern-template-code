package factory.factory.method;

/**
 * 芝加哥风味蛤蜊披萨
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "芝加哥风味蛤蜊披萨";
        dough = "超厚皮面团";
        sauce = "梅子番茄酱";

        toppings.add("马苏里拉芝士丝");
        toppings.add("切萨皮克湾的冻蛤蜊");
    }

    void cut() {
        System.out.println("将披萨切成方形片");
    }
}
