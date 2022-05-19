package state;

/**
 * 糖果售罄状态
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("不能再投钱了，机器已售罄");
    }

    public void ejectQuarter() {
        System.out.println("不退钱，因为还没投钱");
    }

    public void turnCrank() {
        System.out.println("转动曲柄，但没有给糖果");
    }

    public void dispense() {
        System.out.println("操作不当，去找工作人员处理吧");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "卖光了";
    }
}
