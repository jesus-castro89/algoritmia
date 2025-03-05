# Tipos Enumerados

Un tipo enumerado o `enum` es un tipo de dato especial que permite definir un conjunto fijo de constantes con nombre.
Cada constante en un tipo enumerado representa un valor específico y se puede utilizar en lugar de valores numéricos o
cadenas.

En Java, los tipos enumerados se definen utilizando la palabra clave `enum` seguida de una lista de constantes separadas
por comas. A continuación, se presenta un ejemplo de un tipo enumerado en Java:

```java
public enum DiaSemana {
    LUNES,
    MARTES,
    MIÉRCOLES,
    JUEVES,
    VIERNES,
    SÁBADO,
    DOMINGO
}
```

En este ejemplo, se define un tipo enumerado `DiaSemana` que representa los días de la semana. Cada constante en el tipo
enumerado es un día de la semana y se puede utilizar para representar valores específicos en el código.

Los tipos enumerados en Java son útiles para representar conjuntos de constantes relacionadas, como los días de la
semana, los meses del año, los colores, etc. Al utilizar tipos enumerados, se mejora la legibilidad y mantenibilidad del
código, ya que se evita el uso de valores mágicos y se proporciona un conjunto fijo de opciones válidas.

## Tipos Enumerados con atributos

Además de las constantes, los tipos enumerados en Java también pueden tener atributos asociados a cada constante. Estos
atributos pueden ser de cualquier tipo de dato y se pueden utilizar para almacenar información adicional sobre cada
constante.

A continuación, se presenta un ejemplo de un tipo enumerado con atributos en Java:

```java
public enum Mes {
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    OCTUBRE(10),
    NOVIEMBRE(11),
    DICIEMBRE(12);

    private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
```

En este ejemplo, se define un tipo enumerado `Mes` que representa los meses del año. Cada constante en el tipo enumerado
tiene un atributo `numero` que almacena el número correspondiente al mes. Además, se define un constructor y un método
`getNumero()` para acceder al valor del atributo.

Los tipos enumerados con atributos son útiles cuando se necesita asociar información adicional a cada constante, como
números, cadenas, valores predeterminados, etc. Estos atributos pueden mejorar la flexibilidad y funcionalidad de los
tipos enumerados, permitiendo un mayor control sobre las constantes definidas.

## La función `toString()` en tipos enumerados

En Java, los tipos enumerados tienen una implementación predeterminada del método `toString()` que devuelve el nombre de
la constante en forma de cadena. Este método se puede utilizar para obtener una representación legible de una constante
enumerada.

A continuación, se presenta un ejemplo de cómo utilizar el método `toString()` en un tipo enumerado en Java:

```java
public class EjemploEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.LUNES;
        System.out.println("Día de la semana: " + dia.toString());
    }
}
```

En este ejemplo, se crea una variable `dia` de tipo `DiaSemana` con el valor `LUNES` y se imprime el nombre del día de
la semana utilizando el método `toString()`. La salida de este programa sería:

```
Día de la semana: LUNES
```

El método `toString()` en tipos enumerados es útil para obtener una representación legible de las constantes definidas
en el tipo enumerado. Al utilizar este método, se mejora la legibilidad y claridad del código, ya que se evita la
necesidad de acceder directamente al nombre de la constante.

Por consiguiente, podemos redefinir el método `toString()` en un tipo enumerado para proporcionar una representación
personalizada de las constantes. A continuación, se presenta un ejemplo de cómo redefinir el método `toString()` en un
tipo enumerado en Java:

```java
public enum Mes {
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    OCTUBRE(10),
    NOVIEMBRE(11),
    DICIEMBRE(12);

    private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return switch (this) {
            case ENERO -> "Ene";
            case FEBRERO -> "Feb";
            case MARZO -> "Mar";
            case ABRIL -> "Abr";
            case MAYO -> "May";
            case JUNIO -> "Jun";
            case JULIO -> "Jul";
            case AGOSTO -> "Ago";
            case SEPTIEMBRE -> "Sep";
            case OCTUBRE -> "Oct";
            case NOVIEMBRE -> "Nov";
            case DICIEMBRE -> "Dic";
        };
    }
}
```

En este ejemplo, se redefine el método `toString()` en el tipo enumerado `Mes` para devolver una representación
abreviada de los nombres de los meses. Al utilizar una expresión `switch` en el método `toString()`, se puede
personalizar la representación de cada constante en el tipo enumerado.

Al redefinir el método `toString()` en un tipo enumerado, se puede proporcionar una representación personalizada de las
constantes, lo que mejora la legibilidad y claridad del código. Esta técnica es útil cuando se necesita mostrar las
constantes enumeradas de una manera específica en la interfaz de usuario o en la salida del programa.

## Conclusión

Los tipos enumerados en Java son una forma conveniente de definir un conjunto fijo de constantes con nombre. Al utilizar
tipos enumerados, se mejora la legibilidad y mantenibilidad del código, ya que se evita el uso de valores mágicos y se
proporciona un conjunto fijo de opciones válidas. Además, los tipos enumerados con atributos y métodos personalizados
pueden mejorar la funcionalidad y flexibilidad de las constantes definidas.