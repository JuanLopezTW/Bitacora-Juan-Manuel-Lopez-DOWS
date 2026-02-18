# FUNCIONALIDAD: Registrar usuarios

## Información General

| Campo | Detalle |
|---|---|
| **Código** | RF-1 |
| **Nombre** | Registrar usuarios |

---

## Descripción del Caso de Uso

| Campo | Detalle |
|---|---|
| **Descripción** | Se requiere que los usuarios se puedan registrar en la página |
| **Cómo se ejecutará** | El usuario ingresará sus datos/documentos en los campos correspondientes |
| **Actor principal** | Usuario (aspirante) |
| **Precondiciones** | Documentos del usuario, página en interfaz de registro |

---

## Datos de Entrada

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|---|---|---|---|---|
| Nivel de estudio | El usuario elige el nivel de estudio al que desea aplicar | Desplegable | 1 | Sí |
| Programa | El usuario elige el programa al que desea aplicar | Desplegable | 1 | Sí |
| Tipo de admisión | El usuario elige el tipo de admisión que desea | Desplegable | 1 | Sí |
| Categoría de admisión | El usuario elige el tipo de categoría de admisión que cumpla | Desplegable | 1 | Sí |
| Ciclo de admisión | El usuario elige el ciclo de admisión | Desplegable | 1 | Sí |
| Tipo de documento de identidad | El usuario seleccionará su tipo de documento de identidad | Desplegable | 1 | Sí |
| Documento de identidad | El usuario ingresará su documento de identidad actual | Campo de texto | 1 | Sí |
| Aceptar políticas de tratamiento de datos | El usuario elegirá si desea que traten sus datos | Slide | 1 | No |

---

## Datos de Salida

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|---|---|---|---|---|
| | | | | |

---

## Flujo Básico

| Paso | Actor | Descripción | Excepciones |
|---|---|---|---|
| 1 | Aspirante | Entrar a la página | N/A |
| 2 | Aspirante | Entrar a ofertas académicas | N/A |
| 3 | Aspirante | Rellenar el formulario | N/A |
| 4 | Aspirante | Enviar el formulario | Formulario incompleto |
| 5 | Aspirante | Recibir correo | — |

---

## Flujo Alterno

| Paso | Actor | Descripción | Excepciones |
|---|---|---|---|
| 1 | Aspirante | Rellena los campos incompletos del formulario | — |
| 2 | Aspirante | Reenviar el formulario | — |


