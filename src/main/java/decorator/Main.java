package decorator;

/**
 * 配料类是咖啡类的装饰者
 */
public class Main {
    public static void main(String args[]) {
        //  要一杯纯的浓缩咖啡
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());
//        System.out.println("\n");

        //  要一杯黑焙咖啡，加2种配料。配料装饰咖啡
        Coffee darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
//        System.out.println("\n");

        //  要一杯综合咖啡，加3种配料，配料装饰咖啡
        Coffee coffee3 = new HouseBlend();
        coffee3 = new Soy(coffee3);
        coffee3 = new Mocha(coffee3);
        coffee3 = new Whip(coffee3);
        System.out.println(coffee3.getDescription() + " $" + coffee3.cost());
    }
}
