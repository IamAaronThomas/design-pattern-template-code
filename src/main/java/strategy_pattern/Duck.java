package strategy_pattern;

import strategy_pattern.FlyBehavior;
import strategy_pattern.QuackBehavior;

/**
 * 鸭子的基类
 *
 * @author Aaron
 * @version 1.0
 */
public abstract class Duck {
    /**
     * 飞行的行为
     */
    FlyBehavior flyBehavior;
    /**
     * 叫的行为
     */
    QuackBehavior quackBehavior;

    //  可以让子类使用不同的行为
    public Duck() {

    }

    public abstract void display();

    //  鸭子飞
    public void performFly() {
        flyBehavior.fly();
    }

    //  鸭子叫
    public void performQuack() {
        quackBehavior.quack();
    }

    //  让外部调用端能够传入不同的行为
    //  这里和 无参构造函数 二选一即可
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
