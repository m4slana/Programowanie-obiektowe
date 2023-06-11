public class Cone {

    private double r;
    private double h;

    private String name;

    public Cone(double r, double h, String name) {
        this.r = r;
        this.h = h;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double l(double r,double h){
        return Math.hypot(r,h);
    }

    public double pole(double r, double l){
        return Math.PI * r * l + Math.PI * Math.pow(r, 2);
    }

    public double objetosc(double r, double h){
        return Math.PI * Math.pow(r, 2) * h / 3;
    }

    public void wypisz(){
        System.out.format("\nFigura Stożka o nazwie: %s, promień: %.2f, pole: %.2f, objętość: %.2f.",name,r,l(r,h),pole(r,l(r,h)),objetosc(r,h));
    }

}