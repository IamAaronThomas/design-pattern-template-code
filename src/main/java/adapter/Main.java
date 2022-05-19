package adapter;

/**
 * 当客户端像要鸭子，但是目前只有火鸡时，用适配器可以让火鸡也具备鸭子的能力，虽然它不是鸭子。
 */
public class Main {
    public static void main(String[] args) {
        //  创建鸭子
        Duck duck = new MallardDuck();

        //  创建火鸡，将火鸡包装进火鸡适配器，让它看起来像个鸭子
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("火鸡的能力...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\n");

        System.out.println("鸭子的能力...");
        testDuck(duck);
        System.out.println("\n");

        //  这是的火鸡有了鸭子的能力
        //  可以叫（只不过是火鸡的咯咯叫）
        //  可以飞（没有鸭子飞的远，所以鸭子只飞一次，火鸡连续飞5次）
        System.out.println("火鸡适配器的能力...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
