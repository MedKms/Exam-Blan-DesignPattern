package Pattern.Strategy;

import graph.Figure;

import java.util.List;

public class DefaultImpl implements Strategy {
    @Override
    public void traiter(List<Figure> figures) {
        for(Figure figure:figures){
            System.out.println("Default Strategy");
            figure.setEpaisseurContour(29);;
            figure.dessiner();
        }
    }
}
