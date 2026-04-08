## Requerimientos

| Código | Nombre | Tipo | Justificación  funcional y no funcional                                                                                  |
|--------|--------|------|--------------------------------------------------------------------------------------------------------------------------|
| RF01 | Autenticación de usuarios | Funcional | El sistema debe ejecutar flujos concretos: registrar usuarios, validar credenciales y gestionar sesiones.                |
| RF02 | Colección de criaturas | Funcional | Define una acción que el sistema debe ejecutar: almacenar y mostrar criaturas por usuario.                               |
| RF03 | Gestión de inventario | Funcional | Especifica operaciones concretas (agregar, equipar, visualizar) sobre datos del usuario.                                 |
| RF04 | Mejora de criaturas | Funcional | Define un comportamiento de validacion de condiciones, modificacion de datos y guardar en nuevo dato                     |
| RF05 | Economía interna | Funcional | El sistema debe ejecutar lógica de negocio: acreditar moneda por victorias y descontarla al mejorar criaturas.           |
| RF06 | Sistema de combates | Funcional | Describe un flujo completo que el sistema debe procesar: iniciar, resolver y almacenar un combate.                       |
| RF07 | Log de combate | Funcional | El sistema debe registrar y mostrar eventos ordenados cronológicamente, accesibles para ambos jugadores.                 |
| RF08 | Matchmaking | Funcional | El sistema debe tomar una decisión activa: seleccionar y emparejar jugadores según criterios.                            |
| RF09 | Progresión del jugador | Funcional | El sistema debe ejecutar una lógica: calcular y actualizar XP y nivel tras cada combate.                                 |
| RF10 | Perfil e historial | Funcional | El sistema debe consultar y mostrar datos específicos del usuario: combates anteriores y estadísticas.                   |
| RF11 | Notificaciones | Funcional | El sistema debe ejecutar una acción observable: emitir alertas al jugador ante eventos de combate.                       |
| RF12 | Panel de administración | Funcional | El sistema debe permitir operaciones CRUD sobre el catálogo de criaturas y habilidades.                                  |
| RNF01 | Persistencia y consistencia | No Funcional | No describe qué hace el sistema sino cómo debe hacerlo: con garantías de integridad del dato.                            |
| RNF02 | Balance de criaturas | No Funcional | No es una función ejecutable sino una restricción de calidad sobre el diseño del juego, medible con estadísticas.        |
| RNF03 | Seguridad anti-trampas | No Funcional | No describe qué hace el sistema sino cómo debe hacerlo: validando cada acción en el servidor para garantizar integridad. |
| RNF04 | Rendimiento bajo carga | No Funcional | No es una función del sistema sino una restricción sobre su comportamiento: latencia y concurrencia máxima.              |
| RNF05 | Escalabilidad | No Funcional | No describe una funcionalidad sino una restricción sobre cómo debe estar construido el sistema internamente.             |
| RNF06 | Usabilidad web | No Funcional | No describe una función sino una restricción de calidad sobre la interfaz: accesibilidad y tiempo de carga.              |

## Redaccion de requerimientos

---
**RF01 — Autenticación de usuarios**
El sistema debe permitir el registro de nuevos usuarios mediante correo y contraseña, y autenticar sus sesiones mediante tokens con expiración configurable.

**Prioridad: Alta** — Es el requerimiento más bloqueante del sistema. Sin usuarios autenticados ningún otro módulo puede funcionar.

**Dependencias:** Ninguna, es el punto de partida del sistema.

**Bloqueos:** Sin una definición clara del modelo de sesiones (JWT, OAuth, etc.) no puede implementarse.

---
**RF02 — Colección de criaturas**
El sistema debe permitir a cada usuario poseer y visualizar una colección de al menos una criatura Bakugan desde su perfil.

**Prioridad: Alta** — Es el núcleo del producto sin criaturas no existe inventario y tampoco combate ni progresión.

**Dependencias:** RF01 — el usuario debe estar autenticado para tener una colección asociada. RF12 — debe existir un catálogo de criaturas creado previamente.

**Bloqueos:** Sin un catálogo inicial de criaturas cargado en el sistema no hay nada que asignar al usuario.

---
**RF03 — Gestión de inventario**
El sistema debe permitir al usuario equipar, desequipar y visualizar hasta N habilidades por criatura, donde N es un valor configurable por el administrador.

**Prioridad: Media** — Agrega estrategia al combate pero no lo bloquea si las criaturas tienen habilidades fijas inicialmente.

**Dependencias:** RF02 — no se puede gestionar el inventario de una criatura que no existe. RF12 — las habilidades deben estar creadas en el catálogo.

**Bloqueos:** Sin definición del modelo de habilidades (cuántas, de qué tipo, cómo interactúan) no puede implementarse correctamente.

---
**RF04 — Mejora de criaturas**
El sistema debe permitir mejorar los atributos de una criatura cuando el usuario disponga de los recursos requeridos, reflejando los cambios de forma inmediata.

**Prioridad: Media** — Importante para la retención del jugador pero no bloquea el flujo del nucleo.

**Dependencias:** RF02 — requiere que el usuario tenga criaturas. RF05 — requiere que exista una economía que provea los recursos para mejorar.

**Bloqueos:** Sin definición de qué atributos son mejorables, cuánto cuesta cada mejora y si existe un tope máximo, el desarrollo queda bloqueado.

---
**RF05 — Economía interna**
El sistema debe acreditar al usuario una cantidad fija de moneda interna por cada victoria en combate, y descontarla al ejecutar una mejora, sin permitir saldos negativos.

**Prioridad: Media** — Regula el ritmo de progresión sin embargo no es algo indispensable inicialmente.

**Dependencias:** RF06 — las victorias en combate son la fuente principal de moneda. RF04 — el gasto de moneda ocurre al mejorar criaturas.

**Bloqueos:** Sin definición de la cantidad de moneda por victoria ni el costo de cada mejora, los valores quedan como supuestos no validados.

---
**RF06 — Sistema de combates**
El sistema debe permitir iniciar un combate entre dos jugadores, resolver su resultado de forma asíncrona y almacenarlo con marca de tiempo en menos de 5 segundos tras la última acción recibida.

**Prioridad: Alta** — Es la propuesta central del producto, sin combates no hay juego.

**Dependencias:** RF01 — ambos jugadores deben estar autenticados. RF02 — cada jugador debe tener al menos una criatura disponible.

**Bloqueos:** Sin definición de la mecánica de combate (¿por turnos?, ¿stats directos?, ¿hay aleatoriedad?) el motor no puede implementarse.

---
**RF07 — Log de combate**
El sistema debe registrar cada acción de un combate de forma cronológica y hacerla accesible para ambos jugadores involucrados durante al menos 30 días tras su finalización.

**Prioridad: Media** — Mejora la transparencia hacia el jugador con los resultados pero no bloquea el combate en sí.

**Dependencias:** RF06 — no hay acciones que registrar si no hay combates implementados.

**Bloqueos:** El diseño del log depende directamente de cómo funcione el motor de combate. Si la mecánica cambia, el esquema del log cambia con ella.

---
**RF08 — Matchmaking**
El sistema debe emparejar jugadores cuya diferencia de puntuación de poder no supere un umbral configurable, ampliando el rango automáticamente si no se encuentra match en menos de 60 segundos.

**Prioridad: Media** — Mejora la experiencia competitiva pero el combate puede existir sin matchmaking sofisticado en una primera versión.

**Dependencias:** RF09 — necesita datos de nivel o puntuación para emparejar. RF01 — los jugadores deben estar autenticados y activos.

**Bloqueos:** Sin definición del criterio de "emparejamiento justo" por parte del cliente, el umbral configurable queda como supuesto no validado.

---
**RF09 — Progresión del jugador**
El sistema debe actualizar la experiencia y el nivel del jugador automáticamente tras cada combate, aplicando las reglas de cálculo definidas por el administrador.

**Prioridad: Media** — Fundamental para la retención a largo plazo pero no bloquea el flujo de combate inicial.

**Dependencias:** RF06 — no hay progresión sin resultados de combate registrados.

**Bloqueos:** Sin definición de las reglas de cálculo de XP y niveles por parte del cliente, los valores quedan como supuestos.

---
**RF10 — Perfil e historial**
El sistema debe mostrar en el perfil de cada usuario sus estadísticas generales y el historial de sus últimos 50 combates, ordenados de más reciente a más antiguo.

**Prioridad: Media** — Necesario para que el jugador perciba su progresión.

**Dependencias:** RF06 — requiere combates registrados. RF09 — requiere datos de progresión calculados.

**Bloqueos:** Depende de que RF06 y RF09 estén implementados primero.

---
**RF11 — Notificaciones**
El sistema debe notificar al jugador en menos de 30 segundos cuando sea su turno en un combate activo o cuando reciba el resultado de uno finalizado.

**Prioridad: Baja** — El juego puede funcionar sin notificaciones inicialmente.

**Dependencias:** RF06 — solo hay algo que notificar si hay combates en curso o finalizados.

**Bloqueos:** Requiere definir el canal de notificación antes de implementar.

---
**RF12 — Panel de administración**
El sistema debe proveer un panel que permita al administrador crear, editar y eliminar criaturas y habilidades del catálogo, con los cambios reflejados para todos los usuarios activos.

**Prioridad: Baja** — Inicialmente se puede tener un paquete de creaturas para el lanzamiento.

**Dependencias:** RF01 — requiere un rol de administrador autenticado con permisos diferenciados.

**Bloqueos:** Sin definición del modelo de roles y permisos no puede implementarse el acceso al panel.

---
**RNF01 — Persistencia y consistencia**
El sistema debe garantizar que el resultado de cada combate se persista de forma atómica, de manera que un fallo durante el proceso no genere estados inconsistentes en la base de datos.

**Prioridad: Alta** — Una inconsistencia en los resultados destruye la confianza del jugador. Es crítico desde el primer combate.

**Dependencias:** RF06 — aplica directamente sobre el flujo de almacenamiento del combate.

**Bloqueos:** Requiere decisiones de arquitectura de base de datos (transacciones, rollback) antes del desarrollo del motor de combate.

---
**RNF02 — Balance de criaturas**
El sistema debe estar diseñado de forma que ninguna criatura presente una tasa de victoria superior al 65% en combates contra criaturas del mismo nivel, medible con simulaciones de al menos 1000 combates.

**Prioridad: Media** — Importante para la experiencia competitiva. Se ajusta de forma iterativa tras el lanzamiento.

**Dependencias:** RF06 — necesita el motor de combate implementado para poder simular y medir. RF02 — depende del catálogo de criaturas definido.

**Bloqueos:** No puede validarse hasta tener datos reales o un simulador del motor de combate funcionando.

---
**RNF03 — Seguridad anti-trampas**
El sistema debe validar en el servidor el 100% de las acciones de combate, rechazando cualquier solicitud que no provenga del flujo autorizado o que intente modificar directamente el estado del juego.

**Prioridad: Alta** — En un juego competitivo la manipulación de resultados es una amenaza directa a la integridad del producto.

**Dependencias:** RF06 — la seguridad del combate no puede diseñarse sin conocer el flujo del motor.

**Bloqueos:** Sin definición de la mecánica de combate no es posible identificar todos los vectores de ataque a proteger.

---
**RNF04 — Rendimiento bajo carga**
El sistema debe procesar las solicitudes de combate en menos de 2 segundos para el 95% de los casos bajo una carga de hasta 500 usuarios concurrentes.

**Prioridad: Media** — Relevante para la experiencia fluida de navegación.

**Dependencias:** RF06 — el rendimiento se mide principalmente sobre el flujo de combate.

**Bloqueos:** Los umbrales son supuestos preliminares. Sin validación del cliente no pueden establecerse pruebas de carga definitivas.


---
**RNF05 — Escalabilidad**
El sistema debe estar construido con arquitectura modular que permita incorporar nuevos modos de juego o funcionalidades sin modificar el núcleo del motor de combate.

**Prioridad: Media** — Debe definirse en la fase de diseño antes del primer desarrollo.

**Dependencias:** RF06 — el módulo más crítico a aislar es el motor de combate.

**Bloqueos:** Sin claridad sobre las funcionalidades futuras del cliente (eventos, rankings, cooperativo) no puede diseñarse una arquitectura que las soporte correctamente.

---
**RNF06 — Usabilidad web**
El sistema debe ser accesible desde navegadores modernos sin instalación adicional, con un tiempo de carga inicial inferior a 3 segundos en una conexión estándar de 4G.

**Prioridad: Baja** — Es un atributo importante pero se optimiza en fases posteriores una vez el flujo funcional esté estable.

**Dependencias:** Ninguna directa. Aplica transversalmente sobre todos los módulos con interfaz de usuario.

**Bloqueos:** Ninguno crítico. Se valida con pruebas de usuario en fases posteriores.

# Ambigüedades

---
**AMecánica de combate no definida**
El enunciado menciona "combates estratégicos" pero no describe el cómo funciona un combate en el sistema.
No se sabe si es por turnos, si se basa en estadísticas puras, si hay elementos de aleatoriedad, 
ni cuántas acciones tiene cada jugador. Sin esta definición los requerimientos RF06, RF07, RF08, RNF02 y RNF03 no pueden implementarse.

*Requiere validación:* ¿Cómo funciona un combate paso a paso desde que inicia hasta que termina?

---
**"No tiempo real" no especifica el modelo asíncrono**
El cliente aclara que los combates no son en tiempo real pero no define qué modelo asíncrono aplica. 
Las posibilidades son distintas entre sí: ambos jugadores envían acciones y el sistema las resuelve solo, 
hay turnos con tiempo de expiración, o el jugador define su estrategia antes del combate y el sistema lo simula. 
Cada modelo tiene implicaciones técnicas completamente diferentes.

*Requiere validación:* ¿El combate requiere que ambos jugadores estén activos en algún momento o es completamente automatizado?

---
**"Emparejamiento justo" sin criterio definido**
El cliente menciona explícitamente su preocupación por los emparejamientos justos pero no define qué es justo. 
No se sabe si se basa en nivel, puntuación ELO, tipo de criatura o racha de victorias. Tampoco se define qué pasa si no hay oponente disponible. 
Sin un criterio cuantificable RF08 no puede implementarse ni validarse.

*Requiere validación:* ¿Qué variable o variables determinan si dos jugadores son parejos para enfrentarse?

---