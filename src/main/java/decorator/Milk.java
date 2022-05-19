package decorator;

public class Milk extends CondimentDecorator {
    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.10 + coffee.cost();
    }
}
