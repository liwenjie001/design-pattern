package ml.lwj.command;

/**
 * 没有任何命令，既空执行，用于初始化按钮，也就是没有设置功能的时候
 * 当调用空命令时，对象什么都不做即可
 * 这也是一种设计模式，可以剩下对空的判断
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
