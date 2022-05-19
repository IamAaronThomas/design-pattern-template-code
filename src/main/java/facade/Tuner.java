package facade;

/**
 * 调谐器
 */
public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " 打开");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " 将频率设置为 " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println(description + " 设置 AM 模式");
    }

    public void setFm() {
        System.out.println(description + " 设置 FM 模式");
    }

    public String toString() {
        return description;
    }
}
