package factory.factory.method;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    /**
     * 准备
     */
    void prepare() {
        System.out.println("准备 " + name);
        System.out.println("揉面团...");
        System.out.println("添加酱汁...");
        System.out.println("添加浇头... ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("350度烤25分钟");
    }

    void cut() {
        System.out.println("将披萨切成斜片");
    }

    void box() {
        System.out.println("将比萨饼放入官方包装盒中");
    }

    public String getName() {
        return name;
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

 
 
