package iterator;

/**
 * 晚餐菜单
 * 晚餐菜单在数组中
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("素食BLT",
                "全麦培根配生菜和番茄",
                true,
                2.99);

        addItem("BLT",
                "全麦培根配生菜和番茄", false, 2.99);

        addItem("今日例汤",
                "当天的汤，配土豆沙拉", false, 3.29);

        addItem("热狗",
                "热狗，配酸菜、佐料、洋葱，上面是奶酪",
                false, 3.05);

        addItem("清蒸蔬菜和糙米",
                "糙米蒸蔬菜", true, 3.99);

        addItem("意大利面",
                "意大利面配玛丽娜拉酱和一片酸面包",
                true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("抱歉，菜单已满！无法将项目添加到菜单");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
