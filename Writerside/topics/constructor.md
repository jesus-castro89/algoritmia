# El o los constructores de clases

Una función constructora es un método especial que se utiliza para inicializar objetos de una clase. Se llama
automáticamente cuando se crea un nuevo objeto y no tiene un valor de retorno. En Java, el constructor tiene el mismo
nombre que la clase y no tiene un tipo de retorno, ni siquiera `void`. Se puede sobrecargar, lo que significa que se
pueden definir múltiples constructores con diferentes parámetros en la misma clase. Esto permite crear objetos de la
misma clase de diferentes maneras, dependiendo de los argumentos que se pasen al constructor.

Veamos un ejemplo de cómo se define un constructor en Java:

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
```

En este ejemplo, la clase `Persona` tiene dos constructores: uno por defecto que inicializa los atributos `nombre` y
`edad` con valores predeterminados, y otro que permite inicializar estos atributos con valores específicos al crear un
objeto de la clase. A continuación, se muestra cómo se pueden crear objetos de la clase `Persona` utilizando ambos
constructores:

```java
public class Main {
    public static void main(String[] args) {
        // Crear un objeto utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Nombre: " + persona1.getNombre() + ", Edad: " + persona1.getEdad());

        // Crear un objeto utilizando el constructor con parámetros
        Persona persona2 = new Persona("Juan", 25);
        System.out.println("Nombre: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());
    }
}
```

