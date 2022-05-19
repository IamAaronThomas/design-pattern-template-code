package factory.abstract_factory;

/**
 * 披萨配料工厂
 * 每个原料都有一个对应的创建方法
 * 每个原料都是一个类
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
