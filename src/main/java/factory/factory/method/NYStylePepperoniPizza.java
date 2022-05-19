package factory.factory.method;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "纽约风格的意大利辣香肠披萨";
        dough = "薄皮面团";
        sauce = "意大利西红柿酱";

        toppings.add("磨碎的雷吉亚诺奶酪");
        toppings.add("意大利辣香肠片");
        toppings.add("蒜");
        toppings.add("洋葱");
        toppings.add("蘑菇");
        toppings.add("辣椒");
    }
}
