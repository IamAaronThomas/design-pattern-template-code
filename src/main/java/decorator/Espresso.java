package decorator;

/**
 * 浓缩咖啡
 */
public class Espresso extends Coffee {

    public Espresso() {
        description = "浓缩咖啡";
    }

    //  浓咖啡的价格
    public double cost() {
        return 1.99;
    }
}

