package facade;

/**
 * 扩音器
 */
public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 打开");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    public void setStereoSound() {
        System.out.println(description + "立体声模式开启");
    }

    public void setSurroundSound() {
        System.out.println(description + " 环绕声开启（5 个扬声器，1 个低音炮）");
    }

    public void setVolume(int level) {
        System.out.println(description + "将音量设置为" + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + "将调谐器设置为" + tuner);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + "将流媒体播放器设置为" + player);
        this.player = player;
    }

    public String toString() {
        return description;
    }
}
