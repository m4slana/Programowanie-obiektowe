public class Rectangural {

    private double a;

    private double b;

    private double c;

    private String name;


    public Rectangural(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double przekatna(double a, double b, double c){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
    }

    public double pole(double a,double b, double c){
        return 2*((a*b)+(a*c)+(b*c));
    }

    public double obwod(double a,double b, double c){
        return a*b*c;
    }

    public void wypisz(){
        System.out.format("\nFigura prostopadłościanu o nazwie: %s, przekatna: %.2f, pole: %.2f, obwod: %.2f.",name,a,b,c,przekatna(a,b,c), pole(a,b,c), obwod(a,b,c));
    }
}

