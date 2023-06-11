import java.time.LocalDate;

class Budynek {
    private String nazwa;
    private int rokBudowy;
    private int liczbaPieter;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public int wiekBudynku() {
        return LocalDate.now().getYear() - rokBudowy;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa budynku: " + nazwa);
        System.out.println("Rok budowy: " + rokBudowy);
        System.out.println("Liczba pięter: " + liczbaPieter);
        System.out.println("Wiek budynku: " + wiekBudynku() + " lat");
    }

    public static void main(String[] args) {
        Budynek budynek1 = new Budynek("Budynek A", 2000, 5);
        Budynek budynek2 = new Budynek("Budynek B", 1995, 10);
        Budynek budynek3 = new Budynek("Budynek C", 1980, 3);

        budynek1.wyswietlInformacje();
        budynek2.wyswietlInformacje();
        budynek3.wyswietlInformacje();
    }
}