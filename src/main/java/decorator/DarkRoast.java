package decorator;

/**
 * 黑焙咖啡
 */
public class DarkRoast extends Coffee {
    public DarkRoast() {
        description = "黑焙咖啡";
    }

    public double cost() {
        return 0.99;
    }
}

