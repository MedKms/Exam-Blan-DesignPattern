package Pattern.Observer;

import Pattern.Observer.Observable;
import Pattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Paramétrage implements Observable {
    private  int epaisseurContour=3;
    private int coulourContour=210;
    private int coulourRemplissage=120;
    private List<Observer> listObservers=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:listObservers){
            observer.update(this);
        }
    }

    public int getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        notifyObserver();
    }

    public int getCoulourContour() {
        return coulourContour;
    }

    public void setCoulourContour(int coulourContour) {
        this.coulourContour = coulourContour;
        notifyObserver();
    }

    public int getCoulourRemplissage() {
        return coulourRemplissage;
    }

    public void setCoulourRemplissage(int coulourRemplissage) {
        this.coulourRemplissage = coulourRemplissage;
        notifyObserver();
    }
}
