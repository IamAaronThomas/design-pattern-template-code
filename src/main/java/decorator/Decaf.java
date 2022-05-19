package decorator;

import decorator.Coffee;

/**
 * 低咖啡因的咖啡
 */
public class Decaf extends Coffee {
    public Decaf() {
        description = "低咖啡因的咖啡";
    }

    public double cost() {
        return 1.05;
    }
}

