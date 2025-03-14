# Los Registros en Java

Los registros o `record` son una nueva característica introducida en Java 14 que permite definir clases de datos de
forma concisa y eficiente. Los `record` son una forma de definir una clase que encapsula un conjunto de campos y
proporciona métodos de acceso a esos campos de forma automática.

## Declaración de un Registro

Para declarar un registro, se utiliza la palabra clave `record` seguida del nombre del registro y una lista de campos
separados por comas.

```java
public record NombreDelRegistro(TipoDeDato nombreDelCampo1, TipoDeDato nombreDelCampo2, ...) {
    // Cuerpo del registro
}
```

Dónde:

* `NombreDelRegistro`: Es el nombre del registro.
* `TipoDeDato`: Es el tipo de dato de los campos del registro.
* `nombreDelCampo1`, `nombreDelCampo2`, etc.: Son los nombres de los campos del registro.
* `Cuerpo del registro`: Es opcional y puede contener métodos y constructores adicionales.

## Características de los Registros

Los registros tienen las siguientes características:

* **Campos Inmutables**: Los campos de un registro son inmutables, lo que significa que no se pueden modificar una vez
  que se han inicializado.
    * Los campos de un registro son finales, lo que significa que no se pueden reasignar después de la
      inicialización.
    * Los campos de un registro son privados, lo que significa que no se pueden acceder directamente desde fuera del
      registro.
    * Los campos de un registro se inicializan automáticamente a través del constructor del registro.
    * Los campos de un registro se pueden acceder a través de métodos de acceso generados automáticamente.
* **Métodos de Acceso**: Los registros proporcionan métodos de acceso para cada campo, lo que permite acceder a los
  campos de forma segura.
    * Los métodos de acceso siguen la convención de nombres `getNombreDelCampo`. A excepción de los campos `boolean`,
      que siguen la convención de nombres `isNombreDelCampo`.
    * Los métodos de acceso son generados automáticamente por el compilador.
* **Método `toString`**: Los registros proporcionan un método `toString` que genera una representación de cadena del
  registro.
    * Esta función es útil para imprimir el registro en la consola o en un archivo.
    * La representación de cadena generada incluye el nombre de la clase y los valores de los campos del registro.
    * Un ejemplo de representación de cadena generada por un registro es `NombreDelRegistro[nombreDelCampo1=valor1,
      nombreDelCampo2=valor2, ...]`.
    * Puedes sobre escribir el método `toString` para personalizar la representación de cadena del registro.
* **Método `equals`**: Los registros proporcionan un método `equals` que compara dos registros por igualdad estructural.
    * Dos registros son iguales si son del mismo tipo y tienen los mismos valores de campo.
* **Método `hashCode`**: Los registros proporcionan un método `hashCode` que genera un código hash basado en los campos
  del registro.
* **Constructor Implícito**: Los registros proporcionan un constructor implícito que inicializa los campos del registro.
    * Puedes proporcionar constructores adicionales para inicializar los campos del registro de forma personalizada.

## Ejemplos de Registros

### Punto en un Plano Cartesiano

A continuación se muestra un ejemplo de un registro que representa un punto en un plano cartesiano:

```java
public record Punto(int x, int y) {
    public Punto {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Los valores de x e y deben ser mayores o iguales a cero");
        }
    }
}
```

En el ejemplo anterior, se declara un registro `Punto` con dos campos `x` e `y`. Se proporciona un constructor
adicional que válida que los valores de `x` e `y` sean mayores o iguales a cero.

### Persona

A continuación se muestra un ejemplo de un registro que representa una persona:

```java
public record Persona(String nombre, int edad) {
}
```

En el ejemplo anterior, se declara un registro `Persona` con dos campos `nombre` y `edad`.

## Ventajas de los Registros

Los registros tienen las siguientes ventajas:

* **Concisión**: Los registros permiten definir clases de datos de forma concisa y eficiente.
* **Inmutabilidad**: Los campos de un registro son inmutables, lo que evita errores de modificación accidental.
* **Métodos de Acceso**: Los registros proporcionan métodos de acceso generados automáticamente para acceder a los
  campos de forma segura.
* **Métodos `toString`, `equals` y `hashCode`**: Los registros proporcionan métodos `toString`, `equals` y `hashCode`
  generados automáticamente para facilitar la impresión, comparación y uso en colecciones.

## Desventajas de los Registros

Los registros tienen las siguientes desventajas:

* **Limitaciones**: Los registros tienen limitaciones en comparación con las clases normales, como la falta de
  constructores con parámetros y la imposibilidad de extender otras clases.
* **Compatibilidad**: Los registros son una característica relativamente nueva en Java, por lo que pueden no ser
  compatibles con versiones anteriores de Java.
* **Complejidad**: Los registros pueden ser más complejos de entender para los programadores que no están familiarizados
  con esta característica.
* **Uso Limitado**: Los registros son más adecuados para clases de datos simples y no para clases con lógica de negocio
  compleja.
* **Personalización Limitada**: Los registros tienen una personalización limitada en comparación con las clases
  normales, ya que los métodos y constructores son generados automáticamente.

## Conclusión

Los registros son una característica poderosa de Java que permite definir clases de datos de forma concisa y eficiente.
Los registros proporcionan campos inmutables, métodos de acceso generados automáticamente y métodos `toString`, `equals`
y `hashCode` para facilitar el uso de las clases de datos. Aunque los registros tienen algunas limitaciones, como la
falta de constructores con parámetros y la imposibilidad de extender otras clases, son una herramienta útil para
definir clases de datos simples y eficientes en Java.