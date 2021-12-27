package ml.lwj.command;

public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式，完成通过遥控器对电灯的操作

        // 创建电灯的对象
        LightReceiver lightReceiver = new LightReceiver();
        // 电灯开启的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        // 电灯关闭的命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给遥控器设置相关命令， no =0 是电灯是开合关的操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("===============按下开的按钮=================");
        remoteController.onButtonWasPushed(0);
        System.out.println("===============按下关的按钮=================");
        remoteController.offButtonWasPushed(0);
        System.out.println("===============按下撤销按钮=================");
        remoteController.undoButtonWasPushed();

    }
}
