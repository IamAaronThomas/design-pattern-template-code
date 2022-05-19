package strategy_pattern;

/**
 * 诱饵鸭 假鸭子
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("我是诱饵鸭");
    }
}
