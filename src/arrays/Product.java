package arrays;

public class Product {

    String nombre;
    double precio;
    int existencia;

    void applyDiscount(double discount) {

        precio -= precio * (discount / 100);
    }

    void sellItems(int cantidad) {

        if (cantidad < 0) {
            System.out.println("No se puede vender una cantidad negativa.");
        } else if (cantidad > existencia) {
            System.out.println("No hay suficiente existencia para vender.");
        } else {
            existencia -= cantidad;
        }
    }

    void addItems(int cantidad) {

        if (cantidad < 0) {
            System.out.println("No se puede agregar una cantidad negativa.");
        } else {
            existencia += cantidad;
        }
    }

    void printDetails() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Existencia: " + existencia);
    }

    @Override
    public String toString() {
        return "%s - Precio: %.2f - Existencia: %d".formatted(nombre, precio, existencia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
}
