package MyClasses;

public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double V(double a) {
        return a * a * a;
    }

    public double S(double a) {
        return a * a * 6;
    }

    public double D(double a) {
        return Math.sqrt(3) * a;
    }

    public void Info() {
        System.out.println("A= " + a);
    }
}
