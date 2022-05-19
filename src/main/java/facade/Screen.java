package facade;

public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " 上升");
	}

	public void down() {
		System.out.println(description + " 下降");
	}


	public String toString() {
		return description;
	}
}
