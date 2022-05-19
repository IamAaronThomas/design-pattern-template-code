package factory.simple.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 披萨类
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("准备中 " + name);
    }

    public void bake() {
        System.out.println("烘烤 " + name);
    }

    public void cut() {
        System.out.println("切割 " + name);
    }

    public void box() {
        System.out.println("装盒 " + name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();

        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");

        for (String topping : toppings) {
            display.append(topping + "\n");
        }

        return display.toString();
    }
}

