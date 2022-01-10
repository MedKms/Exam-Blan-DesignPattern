package graph;

public class Cercle extends Figure{
    private Point centre;
    private double rayon;

    public Cercle() {
    }

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double calculSurface() {
        return Math.PI*rayon*rayon;
    }

    @Override
    public double calculePermitre() {
        return Math.PI*2*rayon;
    }

    @Override
    public void dessiner() {
        System.out.println(tabs()+"Cercle("+centre+","+rayon+","+super.toString());
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
