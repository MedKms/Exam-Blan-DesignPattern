package Pattern.Strategy;

import graph.Figure;
import graph.GroupeFigures;

import java.util.List;

public class StrategyImpl2 implements Strategy {
    @Override
    public void traiter(List<Figure> figures) {
        for(Figure figure:figures){
            System.out.println("Traitement 1");
            figure.setCoulourContour(255);
            figure.setCoulourRemplissage(210);
            figure.setEpaisseurContour(4);
            if(figure instanceof GroupeFigures){
                traiter(((GroupeFigures)figure).getFigureList());
            }
            figure.dessiner();
        }
    }
}
