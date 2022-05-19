package facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("扩音器");
        Tuner tuner = new Tuner("AM/FM 调谐器", amp);
        StreamingPlayer player = new StreamingPlayer("流媒体播放器", amp);
        Projector projector = new Projector("投影仪", player);
        TheaterLights lights = new TheaterLights("剧院吸顶灯");
        Screen screen = new Screen("剧院屏幕");
        PopcornPopper popper = new PopcornPopper("爆米花");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

        homeTheater.watchMovie("电影：夺宝奇兵");
        homeTheater.endMovie();
    }
}
