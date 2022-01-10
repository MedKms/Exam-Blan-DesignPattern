package graph;

import Pattern.Observer.Observer;
import Pattern.Observer.Paramétrage;
import Pattern.Strategy.Strategy;

import java.io.Serializable;

public abstract class Figure implements Serializable,Observer {
    protected int epaisseurContour;
    protected int coulourContour;
    protected int coulourRemplissage;
    int level;

    public int getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }

    public int getCoulourContour() {
        return coulourContour;
    }

    public void setCoulourContour(int coulourContour) {
        this.coulourContour = coulourContour;
    }

    public int getCoulourRemplissage() {
        return coulourRemplissage;
    }

    public void setCoulourRemplissage(int coulourRemplissage) {
        this.coulourRemplissage = coulourRemplissage;
    }

    @Override
    public String toString() {
        return   epaisseurContour +
                "," + coulourContour +
                "," + coulourRemplissage +
                ')';
    }

    @Override
    public void update(Paramétrage paramétrage) {
        this.epaisseurContour=paramétrage.getEpaisseurContour();
        this.coulourContour=paramétrage.getCoulourContour();
        this.coulourRemplissage=paramétrage.getCoulourRemplissage();
    }
    public String tabs(){
        String tab="";
        for(int i=0;i<level;i++){
            tab+="\t";
        }
        return tab;
    }
    public abstract  double calculSurface();
    public abstract double calculePermitre();
    public abstract void dessiner();
}
