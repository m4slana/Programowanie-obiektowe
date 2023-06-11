public class Main {
    public static void main(String[] args) {
        Gatunek gatunek1 = new Gatunek("Homo", "sapiens", 46, 23, "człowiek współczesny");
        Gatunek gatunek2 = new Gatunek("Felis", "catus", 38, 19, "domowy kot");
        Gatunek gatunek3 = new Gatunek("Canis", "lupus", 78, 39, "szary wilk");

        System.out.println(gatunek1.pelnaNazwa()); // "Homo sapiens"
        System.out.println(gatunek2.liczbaChromosomowN()); // 19
        gatunek3.wypisz();
        Gatunek kopiaGatunku1 = gatunek1.klonuj();
        System.out.println(kopiaGatunku1.pelnaNazwa()); // "Homo sapiens"
    }
}
