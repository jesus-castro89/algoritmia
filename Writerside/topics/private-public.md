# Los niveles de acceso público y privado en Java

En Java, los niveles de acceso `public` y `private` se utilizan para controlar la visibilidad de los miembros de una
clase. Estos niveles de acceso determinan si un miembro de una clase es accesible desde otras clases o solo desde la
propia clase.

## Nivel de acceso `public`

El nivel de acceso `public` se utiliza para declarar miembros de una clase que son accesibles desde cualquier clase en
el mismo paquete o en otros paquetes. Los miembros declarados con el nivel de acceso `public` son visibles para todas
las clases, independientemente de su ubicación en el proyecto.

```java
public class MiClase {
    public int miVariable;
    public void miMetodo() {
        System.out.println("Este es un método público");
    }
}
```

En el ejemplo anterior, `miVariable` y `miMetodo` son miembros públicos de la clase `MiClase`. Esto significa que pueden
ser accedidos desde cualquier clase en el mismo paquete o en otros paquetes.

Por ejemplo, si tenemos otra clase en un paquete diferente que desea acceder a `miVariable` y `miMetodo`, puede hacerlo
sin restricciones:

```java
public class OtraClase {
    public static void main(String[] args) {
        MiClase instancia = new MiClase();
        instancia.miVariable = 10;
        instancia.miMetodo();
    }
}
```

## Nivel de acceso `private`

El nivel de acceso `private` se utiliza para declarar miembros de una clase que solo son accesibles desde la propia
clase. Los miembros declarados con el nivel de acceso `private` no son visibles para otras clases, incluso si están en
el mismo paquete.

```java
public class MiClase {
    private int miVariable;
    private void miMetodo() {
        System.out.println("Este es un método privado");
    }
}
```

En el ejemplo anterior, `miVariable` y `miMetodo` son miembros privados de la clase `MiClase`. Esto significa que solo
pueden ser accedidos desde la propia clase `MiClase`.

Si intentamos acceder a `miVariable` y `miMetodo` desde otra clase, obtendremos un error de compilación:

```java
public class OtraClase {
    public static void main(String[] args) {
        MiClase instancia = new MiClase();
        instancia.miVariable = 10; // Error: miVariable has private access in MiClase
        instancia.miMetodo(); // Error: miMetodo() has private access in MiClase
    }
}
```

## Resumen

- El nivel de acceso `public` se utiliza para declarar miembros de una clase que son accesibles desde cualquier clase en
  el mismo paquete o en otros paquetes.
- El nivel de acceso `private` se utiliza para declarar miembros de una clase que solo son accesibles desde la propia
  clase.
- Los niveles de acceso `public` y `private` son fundamentales para controlar la visibilidad y el encapsulamiento de los
  miembros de una clase en Java.
- Es una buena práctica utilizar el nivel de acceso `private` para los miembros de una clase que no deben ser accesibles
  desde fuera de la clase, y utilizar el nivel de acceso `public` para los miembros que deben ser accesibles desde otras
  clases.