package factory.simple.factory;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("订购了一个 " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("订购了一个 " + pizza.getName() + "\n");
    }
}
