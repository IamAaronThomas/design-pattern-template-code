package state;

/**
 * 所有状态的接口
 * 在这个接口内，Machine的每个动作都有一个对应的方法
 */
public interface State {
    //  投入钱
    public void insertQuarter();

    //  退回钱
    public void ejectQuarter();

    //  转动曲柄
    public void turnCrank();

    //  发糖果
    public void dispense();

    //  售出糖果
    public void refill();
}
