package graph;

public class Rectangle extends Figure{
    private Point coinSupérieur;
    private double largeur;
    private double hauteur;

    public Rectangle(Point coinSupérieur, double largeur, double hauteur) {
        this.coinSupérieur = coinSupérieur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calculSurface() {
        return largeur*hauteur;
    }

    @Override
    public double calculePermitre() {
        return 2*(largeur+hauteur);
    }

    @Override
    public void dessiner() {
        System.out.println(tabs()+"Rectangle ("+coinSupérieur+","+largeur+","+hauteur+","+super.toString());
    }
}
