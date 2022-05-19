package state;

/**
 * 没有人付钱
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    //	构造器得到糖果机的引用，将它记录在实例变量中
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    //  如果有人投入钱，打印一条消息，然后改变机器的状态
    public void insertQuarter() {
        System.out.println("有人投钱了");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("因为没有给钱，所以不退钱。");
    }

    public void turnCrank() {
        System.out.println("没有给钱，即使转动曲柄也没有糖果。");
    }

    public void dispense() {
        System.out.println("你需要先付款");
    }

    public void refill() {
    }

    public String toString() {
        return "等待有人付钱";
    }
}
