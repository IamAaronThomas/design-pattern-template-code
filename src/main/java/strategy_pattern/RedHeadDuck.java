package strategy_pattern;

/**
 * 红头鸭
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("我是红头鸭");
    }
}
