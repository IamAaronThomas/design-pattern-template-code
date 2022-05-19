package command;

public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("浴缸冒泡!");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("浴缸不冒泡");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("打开浴缸喷头");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("关闭浴缸喷头");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        temperature = 105;
        System.out.println("热水浴缸正在加热到热气腾腾的105度");
    }

    public void cool() {
        temperature = 98;
        System.out.println("热水浴缸正在冷却到98度");
    }

}
