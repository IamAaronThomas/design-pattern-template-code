package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 煎饼屋菜单
 * 早餐菜单在ArrayList中
 */
public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("煎饼早餐",
                "煎饼配炒鸡蛋和吐司",
                true,
                2.99);

        addItem("普通煎饼早餐",
                "煎蛋煎饼，香肠",
                false,
                2.99);

        addItem("蓝莓煎饼",
                "用新鲜蓝莓做的薄煎饼",
                true,
                3.49);

        addItem("威化饼",
                "华夫饼配您选择的蓝莓或草莓",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public String toString() {
        return "煎饼屋菜单";
    }

}
