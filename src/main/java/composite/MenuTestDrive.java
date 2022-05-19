package composite;

public class MenuTestDrive {
    public static void main(String args[]) {
        //  创建所有的菜单对象
        MenuComponent pancakeHouseMenu = new Menu("煎饼屋菜单", "早餐");
        MenuComponent dinerMenu = new Menu("晚餐菜单", "晚餐");
        MenuComponent cafeMenu = new Menu("咖啡馆菜单", "晚餐");
        MenuComponent dessertMenu = new Menu("甜点菜单", "当然是甜点");

        //  使用组合的add方法，将每个菜单都加入到顶层菜单addMenus中
        MenuComponent allMenus = new Menu("全部菜单", "所有菜单组合");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //  加入菜单项，构造菜单层次
        pancakeHouseMenu.add(new MenuItem(
                "煎饼早餐",
                "煎饼配炒鸡蛋和吐司",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "普通煎饼早餐",
                "煎蛋煎饼，香肠",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "蓝莓煎饼",
                "用新鲜蓝莓和蓝莓糖浆制成的薄煎饼",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "威化饼",
                "华夫饼配您选择的蓝莓或草莓",
                true,
                3.59));
        dinerMenu.add(new MenuItem(
                "素食BLT",
                "全麦培根配生菜和番茄",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "全麦培根配生菜和番茄",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "今日例汤",
                "一碗当日汤，配一份土豆沙拉",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "热狗",
                "热狗，配酸菜、佐料、洋葱，上面是奶酪",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "清蒸蔬菜和糙米",
                "糙米上的蒸蔬菜混合物",
                true,
                3.99));
        dinerMenu.add(new MenuItem(
                "意大利面",
                "意大利面配马力拉酱和一片酸面包",
                true,
                3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "苹果派",
                "外皮酥脆的苹果派，上面是香草冰淇淋",
                true,
                1.59));
        dessertMenu.add(new MenuItem(
                "乳酪蛋糕",
                "奶油纽约芝士蛋糕，配巧克力全麦面包皮",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "冰糕",
                "一勺覆盆子和一勺酸橙",
                true,
                1.89));
        cafeMenu.add(new MenuItem(
                "素食汉堡和空气炸薯条",
                "全麦面包、生菜、番茄和薯条上的素食汉堡",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "今日例汤",
                "一杯当日汤，配一份沙拉",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "墨西哥卷饼",
                "一个大卷饼，配整颗斑豆、莎莎酱、鳄梨酱",
                true,
                4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
