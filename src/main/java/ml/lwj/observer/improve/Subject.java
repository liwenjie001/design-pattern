package ml.lwj.observer.improve;

public interface Subject {
     void  registerObserver(Observer o);
     void  removeObserver(Observer o);
     void  notifyObserver();
}
