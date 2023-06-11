import java.util.ArrayList;
import java.util.List;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Inicjalizacja tablicy obiektów klasy MyClass
        MyClass[] myArray = new MyClass[5];
        myArray[0] = new MyClass(1);
        myArray[1] = new MyClass(2);
        myArray[2] = new MyClass(3);
        myArray[3] = new MyClass(4);
        myArray[4] = new MyClass(5);

        // Wypełnienie listy List za pomocą zawartości tablicy
        List<MyClass> myList = new ArrayList<>();
        for (MyClass obj : myArray) {
            myList.add(obj);
        }

        // Wyłuskanie fragmentu listy za pomocą subList()
        List<MyClass> subList = myList.subList(1, 4);

        // Usunięcie podlisty z oryginalnej listy
        myList.removeAll(subList);

        // Wyświetlenie zawartości oryginalnej listy
        System.out.println("Oryginalna lista:");
        for (MyClass obj : myList) {
            System.out.println(obj.getValue());
        }
    }
}
