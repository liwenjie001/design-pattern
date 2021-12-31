package ml.lwj.mediator;

public class Alarm extends Colleague{
    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange,this.name);
    }

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }
    public void SendAlarm(int stateChange){
        SendMessage(stateChange);
    }
}
