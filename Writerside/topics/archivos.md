# Lectura y Escritura en Archivos desde Java

## Introducción

La lectura y escritura de archivos es una parte fundamental de la programación en Java. Permite a los desarrolladores
almacenar datos de manera persistente y recuperarlos cuando sea necesario. En este artículo, exploraremos cómo trabajar
con archivos en Java, incluyendo la creación, lectura y escritura de archivos de texto y binarios.

## Tipos de Archivos

Java permite trabajar con varios tipos de archivos, incluyendo:

- Archivos de texto: Archivos que contienen datos en formato legible por humanos, como `.txt`, `.csv`, etc.
- Archivos binarios: Archivos que contienen datos en un formato específico, como imágenes, audio, video, etc.
- Archivos de propiedades: Archivos que almacenan pares clave-valor, comúnmente utilizados para la configuración de
  aplicaciones.
- Archivos XML: Archivos que utilizan el formato XML para almacenar datos estructurados.
- Archivos JSON: Archivos que utilizan el formato JSON para almacenar datos estructurados.

## Clases Principales para Manejar Archivos

Java proporciona varias clases en el paquete `java.io` para trabajar con archivos. Algunas de las clases más comunes
son:

| Clase                | Descripción                                                        |
|----------------------|--------------------------------------------------------------------|
| `File`               | Representa un archivo o directorio en el sistema de archivos.      |
| `FileReader`         | Permite leer datos de un archivo de texto.                         |
| `FileWriter`         | Permite escribir datos en un archivo de texto.                     |
| `BufferedReader`     | Permite leer datos de un archivo de texto de manera eficiente.     |
| `BufferedWriter`     | Permite escribir datos en un archivo de texto de manera eficiente. |
| `PrintWriter`        | Permite escribir datos en un archivo de texto con formato.         |
| `FileInputStream`    | Permite leer datos de un archivo binario.                          |
| `FileOutputStream`   | Permite escribir datos en un archivo binario.                      |
| `ObjectInputStream`  | Permite leer objetos de un archivo binario.                        |
| `ObjectOutputStream` | Permite escribir objetos en un archivo binario.                    |

## Archivos de texto plano

Para trabajar con archivos de texto plano, utilizamos las clases `FileReader`, `BufferedReader`, `FileWriter` y
`BufferedWriter`. A continuación, se muestra un ejemplo de cómo leer y escribir en un archivo de texto:

```java
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class FileExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // Escribir en un archivo de texto
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hola, mundo!");
            writer.newLine();
            writer.write("Este es un archivo de texto.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Leer desde un archivo de texto
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
```

### Explicación del código

1. Importamos las clases necesarias para trabajar con archivos.
2. Definimos la ruta del archivo que vamos a utilizar.
3. Creamos un `BufferedWriter` para escribir en el archivo. Utilizamos `try-catch` para asegurarnos de que el
   recurso se cierre automáticamente.
4. Escribimos algunas líneas en el archivo utilizando el método `write()`.
5. Creamos un `BufferedReader` para leer desde el archivo. Nuevamente, utilizamos `try-catch`.
6. Leemos el archivo línea por línea utilizando el método `readLine()` y lo imprimimos en la consola.
7. Manejamos las excepciones `IOException` para capturar cualquier error que pueda ocurrir durante la lectura o
   escritura del archivo.
8. El archivo se cierra automáticamente al salir del bloque `try-catch`.

> NOTA: Toma en cuenta que para una mejor adaptación de las rutas de acceso a los archivos, puedes utilizar la clase
> `Paths` de Java, que permite trabajar con rutas de acceso de manera más flexible y compatible con diferentes sistemas
> operativos (Windows, Linux, MacOS). Así como usar el siguiente standard para definir la ruta de acceso a los archivos:
> **"carpeta" + File.separator + "archivo.txt"**

## Conclusión

La lectura y escritura de archivos en Java es una tarea sencilla gracias a las clases proporcionadas en el paquete
`java.io`. En este artículo, hemos aprendido a trabajar con archivos de texto utilizando `FileReader`, `BufferedReader`,
`FileWriter` y `BufferedWriter`. También hemos visto cómo manejar excepciones para garantizar que los recursos se
cierren correctamente. Con esta base, puedes comenzar a trabajar con archivos en tus aplicaciones Java.