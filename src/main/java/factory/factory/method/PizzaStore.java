package factory.factory.method;

/**
 * 披萨店
 */
public abstract class PizzaStore {
    /**
     * 创建披萨
     */
    abstract Pizza createPizza(String item);

    /**
     * 订购披萨
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("制造一个" + pizza.getName() + " 。");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
