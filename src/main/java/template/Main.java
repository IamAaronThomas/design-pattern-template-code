package template;

public class Main {
    public static void main(String[] args) {
        //  创建一杯茶
        TeaWithHook teaHook = new TeaWithHook();
        //  创建一杯咖啡
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        //  调用两者的准备工作
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        coffeeHook.addCondiments();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
