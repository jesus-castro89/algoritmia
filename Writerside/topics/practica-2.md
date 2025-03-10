# Práctica 2: Sistema de Cálculo de Descuentos

## Descripción

Crea una clase llamada CalculadoraDescuentos que permita calcular el precio final de un producto después de aplicar un
descuento. El programa debe permitir:

* Calcular el precio final de un producto con un descuento fijo.
* Calcular el precio final de un producto con un descuento porcentual.
* Mostrar un mensaje de bienvenida y despedida.

## Requisitos

* Usa un atributo final para definir el descuento fijo (por ejemplo, 10 unidades monetarias).
* Usa un atributo estático para definir el descuento porcentual (por ejemplo, 15%).
* Implementa métodos estáticos para calcular el precio final con ambos tipos de descuentos.
* Usa JOptionPane para mostrar el menú y leer los datos necesarios.

## Resolvamos el problema

Primero que nada vamos a crear la clase CalculadoraDescuentos. En esta clase vamos a definir los atributos finales de
Descuentos tantos fijos como porcentuales. A continuación, se muestra el código de la clase CalculadoraDescuentos:

```java
import javax.swing.JOptionPane;

public class CalculadoraDescuentos {

    private static final double DESCUENTO_FIJO = 10;
    private static final double DESCUENTO_PORCENTUAL = 0.15;
}
```

Ahora vamos a implementar los métodos estáticos para calcular el precio final con ambos tipos de descuentos. A
continuación, se muestra el código de las funciones:

```java
// Método estático para calcular el precio con descuento fijo
public static double calcularPrecioConDescuentoFijo(double precio){
    
    return precio - DESCUENTO_FIJO;
}

// Método estático para calcular el precio con descuento porcentual
public static double calcularPrecioConDescuentoPorcentual(double precio){
    
    return precio * (1 - DESCUENTO_PORCENTUAL);
}
```

Por último, vamos a implementar el método main para mostrar el menú y leer los datos necesarios. A continuación, se
muestra el código del método main:

```java
public static void menu(){
    
    String mensaje = "Bienvenido a la Calculadora de Descuentos\n\n";
    mensaje += "1. Calcular precio con descuento fijo\n";
    mensaje += "2. Calcular precio con descuento porcentual\n";
    mensaje += "3. Salir\n\n";
    mensaje += "Seleccione una opción:";
    
    int opcion = 0;
    double precio = 0;
    
    while(opcion != 3){
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        switch(opcion){
            case 1->{
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
                JOptionPane.showMessageDialog(null, "El precio final con descuento fijo es: " + calcularPrecioConDescuentoFijo(precio));
            }
            case 2->{
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
                JOptionPane.showMessageDialog(null, "El precio final con descuento porcentual es: " + calcularPrecioConDescuentoPorcentual(precio));
            }
            case 3->{
                JOptionPane.showMessageDialog(null, "Gracias por usar la Calculadora de Descuentos");
            }
        }
    }
}
```

Para finalizar, vamos a llamar al método menu en el método main de la clase CalculadoraDescuentos. A continuación, se
muestra el código completo de la clase CalculadoraDescuentos:

```java
import javax.swing.JOptionPane;

public class CalculadoraDescuentos {

    private static final double DESCUENTO_FIJO = 10;
    private static final double DESCUENTO_PORCENTUAL = 0.15;

    // Método estático para calcular el precio con descuento fijo
    public static double calcularPrecioConDescuentoFijo(double precio){
        
        return precio - DESCUENTO_FIJO;
    }

    // Método estático para calcular el precio con descuento porcentual
    public static double calcularPrecioConDescuentoPorcentual(double precio){
        
        return precio * (1 - DESCUENTO_PORCENTUAL);
    }

    public static void menu(){
        
        String mensaje = "Bienvenido a la Calculadora de Descuentos\n\n";
        mensaje += "1. Calcular precio con descuento fijo\n";
        mensaje += "2. Calcular precio con descuento porcentual\n";
        mensaje += "3. Salir\n\n";
        mensaje += "Seleccione una opción:";
        
        int opcion = 0;
        double precio = 0;
        
        while(opcion != 3){
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            switch(opcion){
                case 1->{
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
                    JOptionPane.showMessageDialog(null, "El precio final con descuento fijo es: " + calcularPrecioConDescuentoFijo(precio));
                }
                case 2->{
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
                    JOptionPane.showMessageDialog(null, "El precio final con descuento porcentual es: " + calcularPrecioConDescuentoPorcentual(precio));
                }
                case 3->{
                    JOptionPane.showMessageDialog(null, "Gracias por usar la Calculadora de Descuentos");
                }
            }
        }
    }

    public static void main(String[] args) {
        
        menu();
    }
}
```

Con esto hemos terminado de implementar la clase CalculadoraDescuentos. Ahora puedes ejecutar el programa y probar su
funcionamiento. ¡Buena suerte!