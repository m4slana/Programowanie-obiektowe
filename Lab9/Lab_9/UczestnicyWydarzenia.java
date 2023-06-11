import java.util.*;

class Uczestnik {
    private int id;
    private String imie;
    private int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczestnik)) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id &&
                Objects.equals(imie, uczestnik.imie) &&
                Objects.equals(wiek, uczestnik.wiek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}

public class UczestnicyWydarzenia {
    public static void main(String[] args) {
        // Przykład z wykorzystaniem LinkedList
        List<Uczestnik> uczestnicyLinkedList = new LinkedList<>();

        Uczestnik uczestnik1 = new Uczestnik(1, "Adam", 25);
        Uczestnik uczestnik2 = new Uczestnik(2, "Ewa", 18);
        Uczestnik uczestnik3 = new Uczestnik(3, "Jan", 32);

        uczestnicyLinkedList.add(uczestnik1);
        uczestnicyLinkedList.add(uczestnik2);
        uczestnicyLinkedList.add(uczestnik3);

        System.out.println("Uczestnicy (LinkedList):");
        for (Uczestnik uczestnik : uczestnicyLinkedList) {
            System.out.println(uczestnik);
        }

        System.out.println("Filtrowanie niepełnoletnich (LinkedList):");
        List<Uczestnik> niepenoletniLinkedList = filtrujNiepenoletnich(uczestnicyLinkedList);
        for (Uczestnik uczestnik : niepenoletniLinkedList) {
            System.out.println(uczestnik);
        }

        System.out.println();

        // Przykład z wykorzystaniem ArrayList
        List<Uczestnik> uczestnicyArrayList = new ArrayList<>();

        uczestnicyArrayList.add(uczestnik1);
        uczestnicyArrayList.add(uczestnik2);
        uczestnicyArrayList.add(uczestnik3);

        System.out.println("Uczestnicy (ArrayList):");
        for (Uczestnik uczestnik : uczestnicyArrayList) {
            System.out.println(uczestnik);
        }

        System.out.println("Filtrowanie niepełnoletnich (ArrayList):");
        List<Uczestnik> niepenoletniArrayList = filtrujNiepenoletnich(uczestnicyArrayList);
        for (Uczestnik uczestnik : niepenoletniArrayList) {
            System.out.println(uczestnik);
        }
    }

    public static List<Uczestnik> filtrujNiepenoletnich(List<Uczestnik> uczestnicy) {
        List<Uczestnik> niepenoletni = new ArrayList<>();
        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() < 18) {
                niepenoletni.add(uczestnik);
            }
        }
        return niepenoletni;
    }
}
