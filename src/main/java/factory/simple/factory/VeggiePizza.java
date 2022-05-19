package factory.simple.factory;

/**
 * 素食披萨
 */
public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		name = "素食披萨";
		dough = "脆皮";
		sauce = "意大利西红柿酱";
		toppings.add("马苏里拉碎");
		toppings.add("磨碎的帕尔马干酪");
		toppings.add("洋葱丁");
		toppings.add("蘑菇片");
		toppings.add("切好的红辣椒");
		toppings.add("切好的黑橄榄");
	}
}
