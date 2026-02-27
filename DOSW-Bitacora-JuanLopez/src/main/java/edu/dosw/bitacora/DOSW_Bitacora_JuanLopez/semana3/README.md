## Semana 3

## AutoEval

¿Qué entendía mal antes?

Que el desarrollo sin Patrones de desarrollo es ineficiente

¿Qué entiendo ahora?

Lo utiles que son los patrones de desarrollo para no tener un desparrame de codigo que no cumpla los solid, aunque
no es zamparlo en cualquier lugar sino saber cuando realmente es necesario

¿Qué me falta reforzar?

Mejor Uso de los patrones de desarrollo

## Anotaciones

Creacionales

Tratan sobre cómo se crean los objetos.

| Patrón | ¿Cómo funciona? | Ejemplo cotidiano |
|--------|----------------|-------------------|
| **Factory Method** | Define una interfaz para crear objetos, pero deja que las subclases decidan qué clase instanciar | Una cafetería que prepara distintos tipos de café según el pedido, sin que el cliente sepa cómo se hace |
| **Abstract Factory** | Crea familias de objetos relacionados sin especificar sus clases concretas | Una tienda de muebles que ofrece familias de estilo (moderno, clásico), donde cada pieza del set es compatible entre sí |
| **Builder** | Separa la construcción de un objeto complejo de su representación final, paso a paso | Armar una hamburguesa en un restaurante: pan, carne, salsas, extras, según el pedido del cliente |

---

Estructurales

Tratan sobre cómo se componen las clases y objetos.

| Patrón | ¿Cómo funciona? | Ejemplo cotidiano |
|--------|----------------|-------------------|
| **Adapter** | Convierte la interfaz de una clase en otra que el cliente espera, permitiendo que trabajen juntas | Un adaptador de corriente que permite conectar un enchufe europeo en un tomacorriente americano |
| **Bridge** | Separa una abstracción de su implementación para que puedan variar independientemente | Un control remoto (abstracción) que puede manejar cualquier marca de televisor (implementación) |
| **Composite** | Compone objetos en estructuras de árbol para representar jerarquías parte-todo | Un sistema de archivos donde una carpeta puede contener archivos u otras carpetas |
| **Decorator** | Añade funcionalidades a un objeto dinámicamente, envolviéndolo en objetos decoradores | Un café al que se le agregan extras: leche, azúcar, crema, cada uno sumando al precio y descripción |

---

De Comportamiento

Tratan sobre cómo se comunican y colaboran los objetos.

| Patrón | ¿Cómo funciona? | Ejemplo cotidiano |
|--------|----------------|-------------------|
| **Chain of Responsibility** | Pasa una solicitud a través de una cadena de manejadores hasta que alguno la procese | El proceso de una visa: revisión de documentos → antecedentes → entrevista → aprobación final |
| **Command** | Encapsula una acción como un objeto, permitiendo parametrizar, encolar o deshacer operaciones | Un control remoto con botones: cada botón es un comando que ejecuta una acción distinta en el TV |
| **Strategy** | Define una familia de algoritmos intercambiables que el cliente puede elegir en tiempo de ejecución | Una app de GPS que permite elegir entre la ruta más rápida, más corta o más económica |