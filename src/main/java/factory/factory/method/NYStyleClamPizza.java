package factory.factory.method;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "纽约风味蛤蜊披萨";
		dough = "薄皮面团";
		sauce = "意大利西红柿酱";
 
		toppings.add("磨碎的雷吉亚诺奶酪");
		toppings.add("长岛海峡的新鲜蛤蜊");
	}
}
