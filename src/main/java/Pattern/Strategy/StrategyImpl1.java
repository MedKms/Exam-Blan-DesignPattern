package Pattern.Strategy;

import graph.Figure;

import java.util.List;

public class StrategyImpl1 implements Strategy {
    @Override
    public void traiter(List<Figure> figurs) {
        for(Figure figure:figurs){
            System.out.println("Implémentation 1");
            figure.setCoulourContour(55);
            figure.dessiner();
        }
    }

}
