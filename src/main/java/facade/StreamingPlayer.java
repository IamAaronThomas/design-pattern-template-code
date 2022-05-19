package facade;

public class StreamingPlayer {
	String description;
	int currentChapter;
	Amplifier amplifier;
	String movie;
	
	public StreamingPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " 打开");
	}
 
	public void off() {
		System.out.println(description + " 关闭");
	}
 
	public void play(String movie) {
		this.movie = movie;
		currentChapter = 0;
		System.out.println(description + " 玩 \"" + movie + "\"");
	}

	public void stop() {
		currentChapter = 0;
		System.out.println(description + " 停止 \"" + movie + "\"");
	}

 
	public String toString() {
		return description;
	}
}
