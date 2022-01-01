package ml.lwj.memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1 攻击力是100");

        // 保存了当前的状态
        caretaker.add(originator.saveStateMento());

        originator.setState("状态2 攻击力是80");

        caretaker.add(originator.saveStateMento());


        System.out.println("当前的状态是=" + originator.getState());
        // 希望恢复到状态1,恢复到状态1

        originator.getStateFromMemento(caretaker.get(0));

        System.out.println("当前的状态是=" + originator.getState());


    }
}
