# Práctica 3: Calculadora Básica

## Descripción

Vamos a implementar una pequeña calculadora que realice operaciones aritméticas simples (suma, resta, multiplicación y
división). Tendremos dos tipos de funciones estáticas:

* Funciones sin retorno (void): Para mostrar resultados directamente en pantalla.
* Funciones con retorno (int o double): Para realizar el cálculo y devolver el resultado.

## Código

```java
import javax.swing.JOptionPane;

public class Calculadora {

    // Función estática sin retorno para mostrar un mensaje
    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Función estática con retorno para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función estática con retorno para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función estática con retorno para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Función estática con retorno para dividir dos números
    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            mostrarMensaje("Error: División por cero.");
            return 0; // Valor por defecto en caso de error
        }
    }

    // Función principal (main)
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        int suma = sumar(num1, num2);
        int resta = restar(num1, num2);
        int producto = multiplicar(num1, num2);
        double cociente = dividir(num1, num2);

        // Mostrar los resultados usando la función sin retorno
        mostrarMensaje("Resultados:\n" +
                       "Suma: " + suma + "\n" +
                       "Resta: " + resta + "\n" +
                       "Multiplicación: " + producto + "\n" +
                       "División: " + cociente);
    }
}
```

## Explicación

En el código anterior, hemos creado una clase `Calculadora` que implementa una calculadora básica en Java. La clase
`Calculadora` contiene las siguientes funciones estáticas:

* `mostrarMensaje`: Función estática sin retorno que muestra un mensaje en una ventana emergente.
* `sumar`: Función estática con retorno que suma dos números enteros.
* `restar`: Función estática con retorno que resta dos números enteros.
* `multiplicar`: Función estática con retorno que multiplica dos números enteros.
* `dividir`: Función estática con retorno que divide dos números enteros y maneja el caso de división por cero.
* `main`: Función principal que solícita al usuario dos números enteros, realiza las operaciones aritméticas y muestra
  los
  resultados en una ventana emergente.
* Las funciones `sumar`, `restar`, `multiplicar` y `dividir` realizan las operaciones aritméticas y devuelven el
  resultado como un valor entero o de punto flotante.
* La función `dividir` comprueba si el segundo número es cero para evitar una división por cero y muestra un mensaje de
  error en caso de que ocurra.
* La función `main` solícita al usuario dos números enteros, realiza las operaciones aritméticas y muestra los
  resultados en una ventana emergente utilizando la función `mostrarMensaje`.

## Puntos clave

* Las funciones estáticas en Java se declaran con la palabra clave `static` y pertenecen a la clase en sí, no a las
  instancias de la clase.
* Las funciones estáticas pueden tener o no un valor de retorno y pueden recibir parámetros o no.
* El uso de `JOptionPane` permite mostrar mensajes y solicitar entrada del usuario en una ventana emergente.
* La combinación de funciones con y sin retorno ilustra cómo pueden trabajar juntas para resolver un problema.