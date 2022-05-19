package command;

/**
 * 遥控器
 * invoker角色
 */
public class RemoteControl {
    //  开命令
    Command[] onCommands;
    //  关命令
    Command[] offCommands;
    //  撤销命令
    Command undoCommand;

    //  构造函数实例化命令
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        //  先将所有的插槽都设置成noCommand，未来有命令了之后，覆盖掉空的插槽
        //  有命令，就执行命令
        //  没有命令，默认是noCommand
        //  例如：遥控器刚出厂时是没有内置命令的，需要后期自定义输入命令
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        //  刚开始初始化时，并没有所谓的“前一个命令”，所以将它设置成NoCommand对象
        undoCommand = noCommand;
    }

    /**
     * @param slot       插槽位置
     * @param onCommand  开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //  按下“开”，执行开的命令
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    //  按下“关”，执行关的命令
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    //  按下撤下按钮，调用undoCommand实例变量的undo()，就可以倒转前一个命令
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    //  toString方法 打印命令
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
