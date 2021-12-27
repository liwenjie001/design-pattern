package ml.lwj.command;

public class LightOnCommand implements Command {

    // 聚合LightReceiver
    // 就是不是通过new 创建的对象
    LightReceiver light;
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
