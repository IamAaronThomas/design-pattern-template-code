package decorator;

/**
 * 综合咖啡
 */
public class HouseBlend extends Coffee {
    public HouseBlend() {
        description = "综合咖啡";
    }

    public double cost() {
        return 0.89;
    }
}

