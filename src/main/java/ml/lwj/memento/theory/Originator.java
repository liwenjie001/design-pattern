package ml.lwj.memento.theory;

public class Originator {
    public String state; // 状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 编写一个方法，保存一个状态对象 Memento
    public Memento saveStateMento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
