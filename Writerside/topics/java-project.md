# Crear un nuevo Proyecto en IntelliJ IDEA

Para crear un nuevo proyecto en IntelliJ IDEA, sigue estos pasos:

1. Abre IntelliJ IDEA y selecciona **Create New Project** en la pantalla de bienvenida.
2. Selecciona el tipo de proyecto que deseas crear. En nuestro caso, seleccionaremos **Java** y haremos clic en
   **Next**.
3. Configura las opciones del proyecto, como el nombre, la ubicación y el SDK de Java. Haz clic en **Finish** para
   crear el proyecto.
    - Si no tienes un SDK de Java configurado, puedes usar el propio IntelliJ IDEA para descargar uno automáticamente.
    - Para efecto del curso usaremos la versión 23 de Java.
4. IntelliJ IDEA creará la estructura base del proyecto y te mostrará la ventana principal del IDE.
5. ¡Listo! Ahora puedes comenzar a programar en Java con IntelliJ IDEA.

## Estructura de un Proyecto en IntelliJ IDEA

Un proyecto en IntelliJ IDEA está compuesto por varios elementos que te permiten organizar y gestionar tu código de
manera eficiente. Algunos de los elementos más importantes de un proyecto son:

- **src**: Directorio que contiene el código fuente de tu proyecto.
- **out**: Directorio que contiene los archivos compilados y generados por el proyecto.
- **.idea**: Directorio que contiene la configuración del proyecto para IntelliJ IDEA.
- **External Libraries**: Bibliotecas externas que se utilizan en el proyecto.

Estos elementos te permiten organizar tu código de manera estructurada y facilitan la gestión de dependencias y
configuraciones del proyecto.

## Crear un Nuevo Paquete

Para organizar tu código de manera más eficiente, puedes crear paquetes en IntelliJ IDEA. Sigue estos pasos para crear
un nuevo paquete en tu proyecto:

1. Haz clic con el botón derecho en el directorio **src** de tu proyecto.
2. Selecciona **New > Package** en el menú contextual.
3. Ingresa el nombre del paquete y haz clic en **OK**.
4. IntelliJ IDEA creará el paquete y lo mostrará en la estructura del proyecto.
5. ¡Listo! Ahora puedes comenzar a agregar clases y archivos al paquete recién creado.

> **Nota**: Los paquetes te permiten organizar y agrupar clases relacionadas en tu proyecto. Es una buena práctica
> utilizar paquetes para mantener una estructura de código clara y legible.

## Crear una Nueva Clase

Para comenzar a escribir código en tu proyecto, necesitas crear una nueva clase en IntelliJ IDEA. Sigue estos pasos para
crear una nueva clase en tu proyecto:

1. Haz clic con el botón derecho en el paquete donde deseas crear la clase.
2. Selecciona **New > Java Class** en el menú contextual.
3. Ingresa el nombre de la clase y haz clic en **OK**.
4. IntelliJ IDEA creará la clase y la abrirá en el editor de código.
5. ¡Listo! Ahora puedes comenzar a escribir el código de la clase en IntelliJ IDEA.

> **Nota**: Las clases son los bloques fundamentales de un programa en Java. Cada clase contiene atributos y métodos que
> definen el comportamiento y la estructura de un objeto en el programa.

## Ejecutar un Programa en IntelliJ IDEA

Una vez que hayas escrito el código de tu programa en IntelliJ IDEA, puedes ejecutarlo para ver los resultados. Sigue
estos pasos para ejecutar un programa en IntelliJ IDEA:

1. Verífica la existencia del método `main` en la clase que deseas ejecutar.
    - Si no existe, puedes crearlo manualmente o utilizar la plantilla de código `psvm` para generar el método
      automáticamente.
    - El método se debe ver de la siguiente manera:
        ```java
        public static void main(String[] args) {
            // Código del programa
        }
        ```
2. Haz clic en el icono de **Play** en la esquina superior derecha del editor de código. O bien, en el botón que sale en
   la parte lateral del código fuente.
3. IntelliJ IDEA compilará y ejecutará tu programa.
4. Observa la salida del programa en la consola de IntelliJ IDEA.
5. ¡Listo! Has ejecutado con éxito tu programa en IntelliJ IDEA.

> **Nota**: El método `main` es el punto de entrada de un programa en Java. Debes asegurarte de que este método esté
> presente en la clase que deseas ejecutar.