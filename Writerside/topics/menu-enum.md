# Usando `enum` con `JOptionPane`

En Java, la clase `JOptionPane` proporciona métodos estáticos para mostrar ventanas de diálogo con mensajes, opciones y
entradas de usuario. Una forma de mejorar la legibilidad y mantenibilidad de un programa que utiliza `JOptionPane` es
mediante el uso de enumeraciones (`enum`) para definir las opciones disponibles en los diálogos.

En este tutorial, se mostrará cómo utilizar un tipo enumerado (`enum`) en combinación con la clase `JOptionPane` para
definir y mostrar un menú de opciones al usuario.

## Definición de un tipo enumerado

Primero, se define un tipo enumerado llamado `OpcionMenu` que contiene las opciones

```java
public enum OpcionMenu {
    OPCION_1("Opción 1"),
    OPCION_2("Opción 2"),
    OPCION_3("Opción 3");

    private final String descripcion;

    OpcionMenu(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public String toString() {
        return String.format("%d. %s", ordinal() + 1, descripcion);
    }
}
```

En este ejemplo, el tipo enumerado `OpcionMenu` define tres constantes con sus respectivas descripciones. Cada constante
tiene un atributo `descripcion` que almacena el texto asociado a la opción. Además, se redefine el método `toString()`
para que devuelva un formato numérico de la opción y su descripción.

En la función `toString()`, se utiliza el método `ordinal()` para obtener el índice de la constante en la enumeración y
se suma 1 para mostrar un índice basado en 1 en lugar de 0.

## Mostrar un menú de opciones

Una vez definido el tipo enumerado `OpcionMenu`, se puede utilizar en conjunto con la clase `JOptionPane` para mostrar
un menú de opciones al usuario. A continuación, se presenta un ejemplo de cómo mostrar un menú de opciones utilizando
`JOptionPane` y el tipo enumerado `OpcionMenu`:

```java
import javax.swing.JOptionPane;

public class MenuOpciones {
    public static void main(String[] args) {
        OpcionMenu[] opciones = OpcionMenu.values();
        OpcionMenu opcionSeleccionada = (OpcionMenu) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción:",
            "Menú de Opciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (opcionSeleccionada != null) {
            JOptionPane.showMessageDialog(null, "Opción seleccionada: " + opcionSeleccionada.getDescripcion());
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.");
        }
    }
}
```

En este ejemplo, se obtienen todas las constantes del tipo enumerado `OpcionMenu` mediante el método `values()`. Luego,
se muestra un cuadro de diálogo con un menú de opciones que permite al usuario seleccionar una de las opciones. El valor
seleccionado se guarda en la variable `opcionSeleccionada`, la cual se utiliza para mostrar la descripción de la opción
seleccionada en un mensaje de diálogo.

Al utilizar un tipo enumerado para definir las opciones del menú, se mejora la legibilidad y mantenibilidad del código,
ya que se centraliza la definición de las opciones en un solo lugar y se evita el uso de cadenas literales dispersas en
el código.

Ahora bien, podemos usar un switch dentro del `if` para realizar acciones específicas según la opción seleccionada:

```java
import javax.swing.JOptionPane;

public class MenuOpciones {
    public static void main(String[] args) {
        OpcionMenu[] opciones = OpcionMenu.values();
        OpcionMenu opcionSeleccionada = (OpcionMenu) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción:",
            "Menú de Opciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case OPCION_1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado la Opción 1.");
                    break;
                case OPCION_2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado la Opción 2.");
                    break;
                case OPCION_3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado la Opción 3.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.");
        }
    }
}
```

En este caso, se utiliza un `switch` para realizar acciones específicas según la opción seleccionada por el usuario.
Cada `case` corresponde a una de las constantes del tipo enumerado `OpcionMenu`, y se muestra un mensaje diferente
según la opción seleccionada. En el `default`, se maneja el caso en que se seleccione una opción no válida.

Al utilizar un `switch` con un tipo enumerado, se mejora la claridad y mantenibilidad del código, ya que se evita el uso
de múltiples comparaciones con cadenas literales y se centraliza la lógica de selección de opciones en un solo lugar.