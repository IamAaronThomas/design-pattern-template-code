package iterator;

/**
 * 菜单
 */
public class MenuItem {
    String name;
    String description;
    //  是不是素食
    boolean vegetarian;
    double price;

    //  初始化菜单项
    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
