public class Gatunek implements Cloneable {
    private String nazwaRodzaju;
    private String nazwaGatunkowa;
    private int liczbaChromosomow2n;
    private int podstawowaLiczbaChromosomow;
    private String opis;

    public Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow2n, int podstawowaLiczbaChromosomow, String opis) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
        this.opis = opis;
    }

    public String pelnaNazwa() {
        return nazwaRodzaju + " " + nazwaGatunkowa;
    }

    public int liczbaChromosomowN() {
        return podstawowaLiczbaChromosomow;
    }

    public void wypisz() {
        System.out.println("Nazwa rodzaju: " + nazwaRodzaju);
        System.out.println("Nazwa gatunkowa: " + nazwaGatunkowa);
        System.out.println("Liczba chromosomów 2n: " + liczbaChromosomow2n);
        System.out.println("Podstawowa liczba chromosomów x: " + podstawowaLiczbaChromosomow);
        System.out.println("Opis: " + opis);
    }

    public Gatunek klonuj() {
        try {
            return (Gatunek) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}