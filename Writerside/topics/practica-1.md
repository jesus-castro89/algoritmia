# Práctica 1: Nuestra Primera Clase en Java

## Introducción

En Java, una clase es una plantilla que define el comportamiento y las propiedades de un objeto. Un objeto, por otro
lado, es una instancia de una clase que puede contener datos y métodos. En este tutorial, aprenderás cómo definir clases
y objetos en Java y cómo interactuar con ellos.

## Definición de una clase

Para definir una clase en Java, utiliza la palabra clave `class` seguida del nombre de la clase y las llaves `{}` para
encerrar el cuerpo de la clase. Por ejemplo:

```java
public class Persona {
    // Propiedades
    String nombre;
    int edad;

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
```

En este ejemplo, se define una clase `Persona` con dos propiedades (`nombre` y `edad`) y un método `saludar` que imprime
un mensaje por consola.

## Creación de un objeto

Para crear un objeto en Java, utiliza la palabra clave `new` seguida del nombre de la clase y los paréntesis `()`. Por
ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona();

        // Inicializar las propiedades del objeto
        persona.nombre = "Juan";
        persona.edad = 30;

        // Llamar al método saludar
        persona.saludar();
    }
}
```

En este ejemplo, se crea un objeto `persona` de la clase `Persona` y se inicializan sus propiedades `nombre` y `edad`.

> **Nota**: En Java, los métodos y propiedades de una clase pueden tener diferentes niveles de acceso, como `public`,
> `private` y `protected`. Estos modificadores de acceso determinan quién puede acceder a los miembros de la clase.
> Por ejemplo, si un método es `public`, puede ser accedido desde cualquier parte del programa, mientras que si es
> `private`, solo puede ser accedido desde dentro de la clase. Pero en este curso solo usaremos `public`.

## Conclusiones

En resumen, las clases y objetos son elementos fundamentales en Java que te permiten modelar el comportamiento y las
propiedades de tus aplicaciones. Al definir clases y crear objetos, puedes organizar y reutilizar tu código de manera
eficiente. ¡Práctica la creación de clases y objetos en Java para mejorar tus habilidades de programación!