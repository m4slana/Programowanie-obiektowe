public class Squere {

    private double a;
    private String name;

    public Squere(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double a){
        return a*a;
    }
    public double obwod(double a){
        return 4*a;
    }

    public void wypisz(){
        System.out.format("\nFigura koła o nazwie: %s, promień: %.2f, pole: %.2f, obwod: %.2f.",name,a,pole(a), obwod(a));
    }
}