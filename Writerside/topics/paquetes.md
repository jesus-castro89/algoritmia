# El uso de paquetes en Java

## ¿Qué es un paquete?

Un paquete es un mecanismo que permite agrupar clases relacionadas en un mismo espacio de nombres. Esto ayuda a
organizar el código y evitar conflictos de nombres entre diferentes clases. En Java, los paquetes se definen utilizando
la palabra clave `package` al inicio de un archivo fuente.

## ¿Cómo se crea un paquete?

Para crear un paquete, se debe declarar el nombre del paquete al inicio del archivo fuente. Por ejemplo, si queremos
crear un paquete llamado `com.ejemplo.miproyecto`, el archivo fuente debe comenzar con la siguiente línea:

```java
package com.ejemplo.miproyecto;
```

Luego, se pueden definir las clases dentro de este paquete. Por ejemplo:

```java
package com.ejemplo.miproyecto;

public class MiClase {
    // Código de la clase
}
```

Lo cual generará una estructura de directorios como la siguiente:

```
📦 src
└─ com
   └─ ejemplo
      └─ miproyecto
         └─ MiClase.java
```

©generated by [Project Tree Generator](https://woochanleee.github.io/project-tree-generator)

## ¿Cómo se importa un paquete?

Para utilizar clases de un paquete en otro archivo fuente, se debe importar el paquete utilizando la palabra clave
`import`. Por ejemplo, si queremos utilizar la clase `MiClase` del paquete `com.ejemplo.miproyecto`, debemos
importarla de la siguiente manera:

```java
import com.ejemplo.miproyecto.MiClase;
```

También se puede importar todo el paquete utilizando un asterisco (`*`):

```java
import com.ejemplo.miproyecto.*;
```

## Ejemplo completo

A continuación se muestra un ejemplo completo de cómo crear y utilizar paquetes en Java:

```java
// Archivo: com/ejemplo/miproyecto/MiClase.java
package com.ejemplo.miproyecto;

public class MiClase {
    public void mostrarMensaje() {
        System.out.println("Hola desde MiClase!");
    }
}
```

```java
// Archivo: com/ejemplo/miproyecto/Main.java
package com.ejemplo.miproyecto;

import com.ejemplo.miproyecto.MiClase;

public class Main {
    public static void main(String[] args) {
        MiClase miClase = new MiClase();
        miClase.mostrarMensaje();
    }
}
```