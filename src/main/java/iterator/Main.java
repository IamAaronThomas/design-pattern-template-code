package iterator;

public class Main {
    public static void main(String args[]) {
        //  早餐
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        //  晚餐
        Menu dinerMenu = new DinerMenu();
        //  将2种菜单都交给服务员
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        //  服务员告诉顾客两种菜单上都有什么菜
        //  使用迭代器
        waitress.printMenu();
    }
}
