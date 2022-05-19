package decorator;

/**
 * 咖啡类
 */
public abstract class Coffee {
    String description = "未知的咖啡";

    /**
     * 饮料描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 饮料成本
     */
    public abstract double cost();
}
