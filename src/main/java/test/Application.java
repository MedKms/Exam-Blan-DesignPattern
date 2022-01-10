package test;
import Pattern.Observer.Paramétrage;
import graph.*;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }

    private void start() {
        System.out.println("---------------------------");
        Figure figure1=new Cercle(new Point(15,14),50);
        System.out.println("Perimetre: "+figure1.calculePermitre());
        System.out.println("Surface: "+figure1.calculSurface());
        figure1.dessiner();
        System.out.println("---------------------------");
        Figure figure2=new Rectangle(new Point(10,10),56,19);
        System.out.println("Perimetre: "+figure2.calculePermitre());
        System.out.println("Surface: "+figure2.calculSurface());
        figure2.dessiner();
        System.out.println("---------------------------");
        Paramétrage paramétrage=new Paramétrage();
        paramétrage.addObserver(figure1);
        paramétrage.addObserver(figure2);
        paramétrage.setCoulourContour(1);
        figure1.dessiner();
        figure2.dessiner();
        System.out.println("---------------------------");
        GroupeFigures groupeFigures=new GroupeFigures();
        Figure fgr=groupeFigures.addFigure(figure1);
        GroupeFigures groupeFigures2=(GroupeFigures) groupeFigures.addFigure(new GroupeFigures());
        groupeFigures2.addFigure(figure2);
        groupeFigures.dessiner();
    }
}
