package strategy_pattern;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("能叫");
	}
}
