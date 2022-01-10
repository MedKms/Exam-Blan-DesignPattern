package graph;

import Pattern.Strategy.DefaultImpl;
import Pattern.Strategy.Strategy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figures=new ArrayList<>();
    private  transient Strategy strategy=new DefaultImpl();

    public Figure addFigure(Figure figure){
        figures.add(figure);
        return figure;
    }
    public void supprimer(Figure figure){
        figures.remove(figure);
    }

    public void serialiser(String fileName) throws IOException {
        File file=new File(fileName);
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }
    public void appliquerStrategyTraitement(){
        this.strategy.traiter(figures);
    }

}
