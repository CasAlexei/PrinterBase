package Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{
    List<String> vacancies = new ArrayList<String >();

    List<Observer> subscribers = new ArrayList<Observer>();

    public void addVacancy (String vacancy){
        this.vacancies.add(vacancy);
       //notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        //notifyObservers();
    }


    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }


    public void notifyObservers(Observer observer) {
//        for(Observer observer:subscribers){
//            observer.handleEvent((this.vacancies));
        }
    }
}
