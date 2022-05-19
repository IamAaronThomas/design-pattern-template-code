package state;

/**
 * 出售状态
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("请稍等，我们已经给你糖果了");
    }

    public void ejectQuarter() {
        System.out.println("对不起，你已经转动曲柄了");
    }

    public void turnCrank() {
        System.out.println("转两次也不会多给你糖果");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("糖没了");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() {
    }

    public String toString() {
        return "发糖";
    }
}
