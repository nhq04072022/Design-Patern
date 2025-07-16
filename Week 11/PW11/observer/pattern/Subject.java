package observer.pattern;


public abstract class Subject {

    public abstract void attach(int eventTpye, Observer observer);
    public abstract void detach(int eventTpye, Observer observer);
    public abstract void notifyObserver(int eventTpye, Event event);

}
