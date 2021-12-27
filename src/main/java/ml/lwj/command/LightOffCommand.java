package ml.lwj.command;

public class LightOffCommand implements Command{
    // 聚合LightReceiver
    // 就是不是通过new 创建的对象
    LightReceiver light;
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
