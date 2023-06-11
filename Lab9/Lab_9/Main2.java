import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main2 {
    public static void main(String[] args) {
        // Utworzenie i zapełnienie listy List<Integer>
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        // Utworzenie drugiej listy List<Integer>
        List<Integer> lista2 = new ArrayList<>();

        // Używanie ListIterator do przejrzenia elementów pierwszej listy i wstawienia ich do drugiej w odwrotnej kolejności
        ListIterator<Integer> iterator = lista1.listIterator(lista1.size());
        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            lista2.add(element);
        }

        // Wyświetlenie zawartości drugiej listy
        System.out.println("Druga lista (odwrotna kolejność):");
        for (int element : lista2) {
            System.out.println(element);
        }
    }
}
