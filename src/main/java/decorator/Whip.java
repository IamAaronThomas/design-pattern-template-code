package decorator;

public class Whip extends CondimentDecorator {
    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.10 + coffee.cost();
    }
}
