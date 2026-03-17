## Ejercicio 1  Patrón Creacional (Factory Method)

Contexto:
Una aplicación necesita crear diferentes tipos de notificaciones según el canal de envío.

Diseñe una solución que permita crear distintos tipos de notificaciones:
-Notificación por correo electrónico

-Notificación por SMS

-Notificación por notificación push

Todas las notificaciones deben poder enviarse, pero la forma de envío cambia según el tipo.
El sistema debe permitir crear el tipo de notificación sin que el código principal dependa directamente de las clases concretas.

## Ejercicio 2 Patrón Estructural (Adapter)

En la aplicación existen dos clases que imprimen mensajes, pero lo hacen de manera distinta:

Clase A (impresora simple):

Imprime únicamente el texto del mensaje en consola.

Clase B (impresora detallada):

Imprime el mensaje incluyendo información adicional, como:

-El texto del mensaje

-El nombre del autor

-La fecha del mensaje

El sistema fue diseñado para trabajar solo con la impresora simple, por lo que no puede usar directamente la impresora detallada.

Enunciado:
Diseñe una solución que permita que el sistema pueda utilizar ambos tipos de impresoras sin modificar ninguna de las clases existentes.
Para lograrlo, debe crear un Adapter que permita que la impresora detallada se comporte como si fuera una impresora simple desde el punto de vista del sistema.


## Ejercicio 3 Patrón de Comportamiento (Memento)

Contexto:
Un editor sencillo permite modificar el contenido de un texto, pero se quiere agregar la opción de deshacer cambios.

Enunciado:
Diseñe un sistema que permita guardar el estado de un texto antes de ser modificado y restaurarlo cuando el usuario lo solicite.

El sistema debe permitir:

-Guardar el estado actual del texto en una estructura de datos (lista)

-Restaurar un estado anterior sin exponer los detalles internos del objeto que contiene el texto.

-El historial de estados debe manejarse sin violar el encapsulamiento del objeto principal.
## Ejercicio 4 Principios SOLID (Calculadora simple)

Contexto:
Se desea construir una calculadora básica, pero bien diseñada.
Enunciado:
Implemente una calculadora que pueda realizar las siguientes operaciones:

-Suma de numeros enteros y de numeros decimales

-Resta de numeros enteros y de numeros decimales

-Multiplicación de numeros enteros y de numeros decimales

-División de numeros enteros y de numeros decimales

Cada operación debe estar separada de la calculadora principal, de manera que agregar una nueva operación no implique modificar el código existente.

En este caso mi calculadora cumple con solid de la siguiente manera

S: cada clase hace solamente una cosa

O: Se puede crear una nueva operacion sin tocar las existentes

L: Cualquier operacion puede pasarse a calculator y funciona igualmente

I: Operator solo tiene metodos utilizados

D: Calculator depende de Operator y no de clases concretas

## AutoEval

¿Qué entendía mal antes?

El mal uso de interfaces que se encargaban de "hacer" todo en lugar de segregarlas en interfaces que con distintos contratos

¿Qué entiendo ahora?

La importancia del solid,para mantener un codigo adecuado y organizado, ademas de como distingirlo en la mayor parte del
codigo que mire

¿Qué me falta reforzar?

Idenficiacion de imcumplimiento el solid ya que aun cometo errores de este tipo sin darme cuenta 



