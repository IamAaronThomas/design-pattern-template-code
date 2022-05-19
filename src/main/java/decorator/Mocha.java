package decorator;

/**
 * 摩卡咖啡
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + coffee.cost();
    }
}
