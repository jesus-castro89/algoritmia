package clases;

public class Main {

    public static void main(String[] args) {

        int x=10;
        System.out.println("x: " + x);
        Life.test(x);
        System.out.println("x: " + x);

        People p = new People();
        p.setName("Juan");
        p.setLastName("Pérez");
        p.setAge(30);
        System.out.println(p);
        Life.grow(p);
        System.out.println(p);
    }
}
