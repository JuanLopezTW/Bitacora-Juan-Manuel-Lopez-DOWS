Readme semana 1

¿Qué entendía mal antes?

-El porque era tan fundamental el uso de streams

¿Qué entiendo ahora?

-Las streams son muy utiles para mejorar la legibilidad del codigo sin contar que son la base,
junto con las funciones anonimas de la programacion funcional

¿Qué me falta reforzar?

-Tener presentes la lista de operacion de los streams y sus usos

Anotacions:

## Operaciones de Stream más usadas

| Operación | Tipo | Uso |
|-----------|------|-----|
| `filter` | Intermedia | Filtra elementos según una condición |
| `map` | Intermedia | Transforma cada elemento en otra cosa |
| `sorted` | Intermedia | Ordena los elementos |
| `distinct` | Intermedia | Elimina duplicados |
| `peek` | Intermedia | Espía cada elemento sin modificarlo |
| `limit` | Intermedia | Limita la cantidad de elementos |
| `skip` | Intermedia | Salta los primeros N elementos |
| `collect` | Terminal | Recoge los elementos en una colección |
| `count` | Terminal | Cuenta cuántos elementos hay |
| `forEach` | Terminal | Ejecuta una acción por cada elemento |
| `anyMatch` | Terminal | `true` si al menos uno cumple la condición |
| `allMatch` | Terminal | `true` si todos cumplen la condición |
| `noneMatch` | Terminal | `true` si ninguno cumple la condición |
| `findFirst` | Terminal | Retorna el primer elemento |
| `min / max` | Terminal | Retorna el mínimo o máximo |
| `reduce` | Terminal | Combina todos los elementos en un solo valor |