package strategy_pattern;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不能叫");
    }
}
