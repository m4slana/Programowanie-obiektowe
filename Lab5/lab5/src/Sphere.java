public class Sphere {

    private double r;
    private String name;

    public Sphere(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    public double obwod(double r){
        return (4.0/3.0)*Math.PI*Math.pow(r,3);
    }

    public void wypisz(){
        System.out.format("\nFigura kuli o nazwie: %s, promień: %.2f, pole: %.2f, obwod: %.2f.",name,r, pole(r), obwod(r));
    }
}