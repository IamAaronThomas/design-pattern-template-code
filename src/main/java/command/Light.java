package command;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "开灯");
    }

    public void off() {
        System.out.println(location + "关灯");
    }
}
