package facade;

public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " 打开");
	}
 
	public void off() {
		System.out.println(description + " 关闭");
	}

	public void pop() {
		System.out.println(description + " 爆米花嘭!");
	}
 
  
        public String toString() {
                return description;
        }
}
