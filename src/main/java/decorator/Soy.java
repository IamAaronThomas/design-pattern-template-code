package decorator;

public class Soy extends CondimentDecorator {
    public Soy(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + coffee.cost();
    }
}
