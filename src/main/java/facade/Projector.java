package facade;

public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " 打开");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    public void wideScreenMode() {
        System.out.println(description + " 在宽屏模式下（16x9 纵横比");
    }


    public String toString() {
        return description;
    }
}
