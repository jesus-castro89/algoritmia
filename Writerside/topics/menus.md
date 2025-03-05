# Menús de Interacción con JOptionPane

En Java, la clase `JOptionPane` proporciona un formato de su función `showInputDialog()` que permite mostrar un menú de
opciones al usuario. Este método recibe 7 parámetros, de los cuales 5 son obligatorios y 2 son opcionales. A
continuación, se muestra la sintaxis de este método:

```java
String[] opciones = { "Opción 1", "Opción 2", "Opción 3" };
String opcionSeleccionada = (String) JOptionPane.showInputDialog(
    null,
    "Selecciona una opción:",
    "Menú de Opciones",
    JOptionPane.QUESTION_MESSAGE,
    null,
    opciones,
    opciones[0]
);
```

Donde:

* `null`: Es el componente padre del diálogo. Si se pasa `null`, el diálogo se centrará en la pantalla.
* `"Selecciona una opción:"`: Es el mensaje que se muestra en el diálogo.
* `"Menú de Opciones"`: Es el título del diálogo.
* `JOptionPane.QUESTION_MESSAGE`: Es el tipo de mensaje que se muestra en el diálogo.
* `null`: Es el icono que se muestra en el diálogo. Si se pasa `null`, se muestra el icono predeterminado.
* `opciones`: Es un arreglo de cadenas que contiene las opciones del menú.
* `opciones[0]`: Es la opción predeterminada seleccionada en el menú.

En este ejemplo, se muestra un menú de opciones con las opciones `"Opción 1"`, `"Opción 2"` y `"Opción 3"`. El usuario
puede seleccionar una de las opciones y el valor seleccionado se guarda en la variable `opcionSeleccionada`.

Es importante tener en cuenta que el valor devuelto por `showInputDialog()` es de tipo `Object`, por lo que es necesario
convertirlo al tipo de dato deseado. En este caso, se convierte a `String` ya que las opciones del menú son cadenas.

A continuación, se presenta un ejemplo completo de cómo mostrar un menú de opciones utilizando `JOptionPane`:

```java
import javax.swing.JOptionPane;

public class MenuOpciones {
    public static void main(String[] args) {
        String[] opciones = { "Opción 1", "Opción 2", "Opción 3" };
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción
            :",
            "Menú de Opciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (opcionSeleccionada != null) {
            JOptionPane.showMessageDialog(null, "Opción seleccionada: " + opcionSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.");
        }
    }
}
```

En este ejemplo, se muestra un menú de opciones con las opciones `"Opción 1"`, `"Opción 2"` y `"Opción 3"`. Si el
usuario selecciona una opción, se muestra un mensaje con la opción seleccionada; de lo contrario, se muestra un mensaje
indicando que no se seleccionó ninguna opción.

Los menús de opciones son útiles para presentar al usuario una lista de opciones para elegir, lo que facilita la
interacción con la aplicación y mejora la experiencia del usuario.

## Ventana de Confirmación

Además de los menús de opciones, `JOptionPane` también proporciona un método para mostrar una ventana de confirmación al
usuario. Este método recibe 4 parámetros, de los cuales 3 son obligatorios y 1 es opcional. A continuación, se muestra
la
sintaxis de este método:

```java
int confirmacion = JOptionPane.showConfirmDialog(
    null,
    "¿Estás seguro de continuar?",
    "Confirmación",
    JOptionPane.YES_NO_OPTION
);
```

Donde:

* `null`: Es el componente padre del diálogo. Si se pasa `null`, el diálogo se centrará en la pantalla.
* `"¿Estás seguro de continuar?"`: Es el mensaje que se muestra en la ventana de confirmación.
* `"Confirmación"`: Es el título de la ventana de confirmación.
* `JOptionPane.YES_NO_OPTION`: Es el tipo de opciones que se muestran en la ventana.
* `confirmacion`: Es el valor entero que representa la opción seleccionada por el usuario.

En este ejemplo, se muestra una ventana de confirmación con el mensaje `"¿Estás seguro de continuar?"` y dos opciones:
`Sí` y `No`. El valor devuelto por `showConfirmDialog()` representa la opción seleccionada por el usuario:

* `JOptionPane.YES_OPTION` si el usuario selecciona `Sí`.
* `JOptionPane.NO_OPTION` si el usuario selecciona `No`.
* `JOptionPane.CLOSED_OPTION` si el usuario cierra la ventana sin seleccionar ninguna opción.
* `JOptionPane.CANCEL_OPTION` si el usuario cancela la operación.
* `JOptionPane.OK_OPTION` si el usuario selecciona `Aceptar`.
* `JOptionPane.CANCEL_OPTION` si el usuario selecciona `Cancelar`.

Este valor puede ser utilizado para realizar diferentes acciones en función de la respuesta del usuario.

Las alternativas de `showConfirmDialog` son:

| Constante              | Descripción                                  |
|------------------------|----------------------------------------------|
| `YES_NO_OPTION`        | Muestra los botones `Sí` y `No`.             |
| `YES_NO_CANCEL_OPTION` | Muestra los botones `Sí`, `No` y `Cancelar`. |
| `OK_CANCEL_OPTION`     | Muestra los botones `Aceptar` y `Cancelar`.  |

A continuación se muestra un ejemplo completo que muestra una ventana de confirmación al usuario y realiza una acción en
función de la respuesta:

```java
import javax.swing.JOptionPane;

public class VentanaConfirmacion {
    public static void main(String[] args) {
        int confirmacion = JOptionPane.showConfirmDialog(
            null,
            "¿Estás seguro de continuar?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Operación confirmada.");
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
    }
}
```

En este ejemplo, se muestra una ventana de confirmación al usuario y se muestra un mensaje diferente en función de la
respuesta seleccionada por el usuario.

La ventana de confirmación es una herramienta útil para solicitar la confirmación del usuario antes de realizar una
acción importante en una aplicación de escritorio en Java.