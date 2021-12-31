package ml.lwj.mediator;

import java.util.HashMap;

public class ConcreteMediator extends  Mediator{
    // 集合，放入所有同时对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {

    }

    @Override
    public void GetMessage(int stateChange, String colleague) {

    }

    @Override
    public void SendMessage() {

    }
}
