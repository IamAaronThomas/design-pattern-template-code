package strategy_pattern;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("不能飞");
	}
}
