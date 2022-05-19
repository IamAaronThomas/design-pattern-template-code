package command;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //  创建装置对象
        Light livingRoomLight = new Light("卧室");
        Light kitchenLight = new Light("厨房");
//        CeilingFan ceilingFan = new CeilingFan("卧室");
        Stereo stereo = new Stereo("卧室");

        //  创建所有得电灯命令对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //  创建吊扇得开和关的命令
//        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        //  创建音响的开与关的命令
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //  将命令加载到遥控器中
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        //  打印查看遥控器中有什么命令
        System.out.println(remoteControl);

        //  执行不同的命令
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        //  撤销命令
        remoteControl.undoButtonWasPushed();
    }
}
