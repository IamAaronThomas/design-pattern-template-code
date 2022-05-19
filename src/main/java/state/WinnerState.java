package state;

/**
 * 赢得糖果
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("你是赢家，你这次会得到两块糖果");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("糖没了");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public void refill() {
    }

    public String toString() {
        return "给你两块糖，因为你是这次的幸运玩家";
    }
}
