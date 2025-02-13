# Los Subprocesos o Funciones

Los subprocesos o funciones son bloques de código que se pueden ejecutar de manera independiente al programa principal.
Estos subprocesos pueden ser llamados desde cualquier parte del programa principal y pueden ser utilizados para realizar
tareas específicas.

## Características de los Subprocesos

- **Independencia**: Los subprocesos son independientes del programa principal, lo que significa que pueden ejecutarse
  de
  manera independiente y paralela al programa principal.
- **Reutilización**: Los subprocesos pueden ser reutilizados en diferentes partes del programa, lo que permite escribir
  código modular y reutilizable.
- **Paralelismo**: Los subprocesos pueden ejecutarse de manera paralela, lo que permite realizar tareas simultáneas y
  mejorar el rendimiento del programa.
- **Comunicación**: Los subprocesos pueden comunicarse entre sí a través de variables compartidas, lo que permite
  intercambiar información y coordinar tareas.
- **Concurrencia**: Los subprocesos pueden ejecutarse de manera concurrente, lo que permite realizar tareas simultáneas
  de manera independiente.
- **Escalabilidad**: Los subprocesos pueden escalarse para ejecutar tareas más complejas y demandantes, lo que permite
  mejorar el rendimiento y la eficiencia del programa.

En resumen, los subprocesos son bloques de código independientes que pueden ejecutarse de manera paralela al programa
principal, lo que permite realizar tareas simultáneas y mejorar el rendimiento del programa.

## Tipos de Subprocesos

Existen diferentes tipos de subprocesos, que se pueden clasificar en función de su comportamiento y su relación con el
programa principal. Algunos de los tipos de subprocesos más comunes son:

- **Subprocesos Con Retorno**: Son subprocesos que devuelven un valor al programa principal, lo que permite obtener un
  resultado específico.
- **Subprocesos Sin Retorno**: Son subprocesos que no devuelven ningún valor al programa principal, lo que significa que
  solo realizan una tarea específica.

Además, los subprocesos pueden ser clasificados en función de su comportamiento y su relación con otros subprocesos.
Algunos de los tipos de subprocesos más comunes son:

- **Subprocesos Síncronos**: Son subprocesos que se ejecutan de manera secuencial, lo que significa que el programa
  principal espera a que el subproceso termine para continuar con la ejecución.
- **Subprocesos Asíncronos**: Son subprocesos que se ejecutan de manera paralela, lo que significa que el programa
  principal puede continuar con la ejecución sin esperar a que el subproceso termine.
- **Subprocesos Anidados**: Son subprocesos que se pueden llamar desde otros subprocesos, lo que permite crear una
  jerarquía de subprocesos.
- **Subprocesos Independientes**: Son subprocesos que se ejecutan de manera independiente, lo que significa que pueden
  ejecutarse de manera paralela al programa principal.
- **Subprocesos Dependientes**: Son subprocesos que dependen de otros subprocesos, lo que significa que deben esperar a
  que los subprocesos anteriores terminen para poder ejecutarse.

En resumen, los subprocesos pueden ser clasificados en diferentes tipos en función de su comportamiento y su relación
con el programa principal, lo que permite realizar tareas específicas de manera independiente y paralela.

## Representación en Pseudo-Código de un Subproceso

La representación en pseudo-código de un subproceso se realiza de la siguiente manera:

```
Subproceso NombreDelSubproceso(Parámetros)
    Instrucciones
Fin Subproceso
```

Donde:

- `NombreDelSubproceso`: Es el nombre del subproceso.
- `Parámetros`: Son los parámetros que recibe el subproceso.
- `Instrucciones`: Son las instrucciones que realiza el subproceso.
- `Fin Subproceso`: Indica el fin del subproceso.

Por ejemplo, el siguiente pseudo-código representa un subproceso que suma dos números:

```
Subproceso Sumar(Entero A, Entero B)
    Entero Resultado
    Resultado = A + B
    Devolver Resultado
Fin Subproceso
```

En este caso, el subproceso `Sumar` recibe dos parámetros de tipo entero `A` y `B`, realiza la operación de suma y
devuelve el resultado.

Para hacer uso del mismo en un algoritmo principal, se puede hacer de la siguiente manera:

```
Entero Numero1 = 5
Entero Numero2 = 3
Entero Suma

Suma = Sumar(Numero1, Numero2)
Escribir "La suma de ", Numero1, " y ", Numero2, " es ", Suma
```

En este caso, se llama al subproceso `Sumar` con los valores `Numero1` y `Numero2`, se almacena el resultado en la
variable `Suma` y se muestra el resultado por pantalla.

En resumen, la representación en pseudo-código de un subproceso permite definir bloques de código independientes que
pueden ser reutilizados en diferentes partes del programa principal para realizar tareas específicas.

## Ejemplo de Subproceso

```text
Nombre del Algoritmo: ProductoConIva
Definir Constantes:
    Real: IVA = 0.16
Definición de Variables:
    Real: Precio, Iva, IvaProducto, Total
    Entero: CantidadProductos
Definición de Subprocesos:
    1. Inicio Subproceso CalcularIva(Real Precio, Real Iva)
    2. Definir Real: Total// Esto es opciónal, dadó que se declara en el algoritmo principal
    3. Hacer Total = (Precio * Iva)
    4. Devolver Total
    5. Fin Subproceso
    
    1. Inicio Subproceso ProductoConIva()
    2. Escribir "Ingrese el precio del producto:"
    3. Leer Precio
    4. Escribir "Ingrese el porcentaje de IVA:"
    5. Leer Iva
    //6. Hacer IvaProducto = CalcularIva(Precio, IVA)
    7. Escribir "El total a pagar es: ", (Precio + CalcularIva(Precio, Iva))
    8. Fin Subproceso 
Algoritmo:
  1. Inicio
  2. Escribir "Ingrese la cantidad de productos a comprar:"
  3. Leer CantidadProductos
  4. Para i = 1 Hasta CantidadProductos Hacer
        ProductoConIva()
  5. Fin  
```
