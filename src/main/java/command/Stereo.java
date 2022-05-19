package command;

public class Stereo {
	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + "立体声已开启");
	}

	public void off() {
		System.out.println(location + "立体声已关闭");
	}

	public void setCD() {
		System.out.println(location + " 立体声设置为 CD 输入");
	}

	public void setDVD() {
		System.out.println(location + " 立体声设置为 DVD 输入");
	}

	public void setRadio() {
		System.out.println(location + " 立体声设置为收音机");
	}

	public void setVolume(int volume) {
		System.out.println(location + "立体声音量设置为 " + volume);
	}
}
