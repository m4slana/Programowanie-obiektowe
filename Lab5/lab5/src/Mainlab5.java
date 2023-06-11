public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"kolo 1");
        circle.wypisz();

        Cube cube = new Cube(3,"sześcian 1");
        cube.wypisz();

        Squere squere = new Squere(3,"kwadrat 1");
        squere.wypisz();

        Cone cone = new Cone(2,2,"stożek 1");
        cone.wypisz();

        Rectangle rectangle = new Rectangle(2, 3, "prostokąt 1");
        rectangle.wypisz();

        Rectangural rectangural = new Rectangural(2,2,2,"prostopadloscian 1");
        rectangural.wypisz();

        Sphere sphere = new Sphere(2,"kula 1");
        sphere.wypisz();
    }
}