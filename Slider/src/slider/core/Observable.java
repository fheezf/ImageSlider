package slider.core;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observerList;

    public Observable() {
        this.observerList = new ArrayList<Observer>();
    }
    
    public void add(Observer observer) {
        observerList.add(observer);
    }
    
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
    
    public void notifyChanges() {
        for (Observer observer : observerList)
            observer.changed();
    }
    
    

}
