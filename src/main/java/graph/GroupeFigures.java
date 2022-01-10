package graph;

import Pattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public  class GroupeFigures extends Figure{
    private List<Figure> figureList=new ArrayList<>();



    public List<Figure> getFigureList() {
        return figureList;
    }
    public Figure addFigure(Figure figure){
        figure.level=this.level+1;
        figureList.add(figure);
        return figure;
    }

    @Override
    public double calculSurface() {
        return 0;
    }

    @Override
    public double calculePermitre() {
        return 0;
    }

    @Override
    public void dessiner() {
        System.out.println(tabs()+"Groupe:");
        for(Figure figure:figureList){
            figure.dessiner();
        }
    }
}
