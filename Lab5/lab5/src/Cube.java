public class Cube {
    private double a;

    private String name;

    public Cube(double a, String name) {
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
        return Math.pow(a,3);
    }

    public double obwod(double a){
        return Math.pow(a,2);
    }

    public void wypisz(){
        System.out.format("\nFigura sześcianu o nazwie: %s, pole: %.2f, obwod: %.2f.",name,a,pole(a), obwod(a));
    }
}