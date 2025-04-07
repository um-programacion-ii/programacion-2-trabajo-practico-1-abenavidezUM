[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JQrLgaz)
# 🧠 Trabajo Práctico: Sistema de Gestión de Vehículos (Java + SOLID + GitHub)

## 📌 Objetivo General

Desarrollar una aplicación en Java para gestionar vehículos de una empresa, aplicando los principios de programación orientada a objetos y los **primeros tres principios SOLID**:  
**SRP (Single Responsibility), OCP (Open/Closed) y LSP (Liskov Substitution)**.

A lo largo del trabajo se utilizará también la estructura `ArrayList` para manejar listas dinámicas de vehículos.

Además, deberán aplicar buenas prácticas de **gestión de proyectos usando GitHub**: `Issues`, `Milestones`, `Projects` y `Pull Requests`.

---

## 🧩 Tecnologías y Herramientas

- Java SE (cualquier versión compatible con JDK 8+)
- Git y GitHub
- GitHub Projects
- GitHub Issues
- GitHub Pull Requests

---

## 📘 Etapas del Trabajo

El trabajo está dividido en etapas. Cada etapa deberá registrarse como un **Milestone** en GitHub.

### Etapa 1: Clases Básicas
- Crear la clase `Vehiculo` con atributos: `patente`, `marca`, `año`, `capacidadCargaKg`.
- Agregar constructor, getters/setters y método `mostrarInformacion()`.
- Crear la clase `Main` que cree e imprima al menos 3 vehículos.

### Etapa 2: Aplicar SRP
- Extraer la responsabilidad de impresión a una nueva clase `VehiculoPrinter`.
- Eliminar el método `mostrarInformacion()` de `Vehiculo`.

### Etapa 3: Aplicar OCP
- Crear subclase `Camion` con atributo `tieneAcoplado`.
- Modificar `VehiculoPrinter` para imprimir camiones sin modificar el código existente (usar polimorfismo).

### Etapa 4: Aplicar LSP
- Crear subclase `Auto` con atributo `cantidadPasajeros`.
- Validar que se puedan tratar todos los vehículos desde una misma interfaz (`Vehiculo`).

### Etapa 5: Uso de ArrayList
- Usar `ArrayList<Vehiculo>` para gestionar todos los vehículos.
- Recorrer e imprimir usando `VehiculoPrinter`.
- (Opcional) Buscar por patente dentro de la lista.

---

## ✅ Entrega y Flujo de Trabajo con GitHub

Cada grupo debe:

1. Usar la asignación del repositorio compartido por Slack

2. **Proteger la rama main**:
   - Ir a Settings > Branches > Branch protection rules
   - Agregar regla para la rama `main`
   - Requerir que los tests pasen antes de mergear
   - No permitir push directo a main

3. Crear un **Project** nuevo tipo _Kanban_ con columnas:
   - `To Do`, `In Progress`, `In Review`, `Done`

4. Crear un **Milestone por etapa**:
   - `Etapa 1 - Clases básicas`
   - `Etapa 2 - SRP`
   - `Etapa 3 - OCP`
   - `Etapa 4 - LSP`
   - `Etapa 5 - ArrayList`

5. Crear **Issues** por cada tarea concreta, por ejemplo:
   - "Crear clase Vehiculo"
   - "Crear clase VehiculoPrinter"
   - "Crear subclase Camion"

   Cada Issue debe:
   - Tener un título claro y descripción breve
   - Estar asociado a un `Milestone` y al `Project`
   - Tener asignado al menos un miembro del equipo
   - Incluir labels apropiados (ej: `enhancement`, `bug`, `documentation`)
   - Ser implementado en una nueva rama (branch) creada desde `main`
   - La rama debe seguir el formato: `feature/descripcion-corta` o `fix/descripcion-corta`
   - Ser cerrado mediante un Pull Request (PR) que mergee la rama a `main`
   - Actualizar su estado en el Kanban board según corresponda

6. Hacer **Pull Requests** por cada Issue.
   - Cada PR debe mencionar el Issue que cierra (ej: `Closes #2`)
   - Debe incluir los mismos labels que el Issue asociado
   - Debe estar asociado al mismo Milestone que el Issue
   - Debe estar asociado al mismo Project que el Issue
   - El código debe estar revisado antes de ser fusionado a `main`
   - Al mergear, actualizar el estado del Issue en el Kanban board a `Done`

---

## ✅ Ejemplo de Issue

### Título
Crear clase Vehiculo

### Descripción
Implementar la clase base `Vehiculo` que servirá como punto de partida para la jerarquía de vehículos.

#### Requisitos
- Crear la clase con los siguientes atributos privados:
  ```java
  private String patente;
  private String marca;
  private int anio;
  private double capacidadCargaKg;
  ```
- Implementar:
  - Constructor con todos los atributos
  - Getters y setters para cada atributo
  - Método `mostrarInformacion()` que imprima todos los datos del vehículo

#### Validaciones
- La patente no puede ser null ni vacía
- El año debe ser mayor a 1900 y menor o igual al año actual
- La capacidad de carga debe ser positiva

#### Criterios de Aceptación
- [ ] La clase compila sin errores
- [ ] Se incluyen todos los atributos requeridos
- [ ] Se implementan todos los métodos necesarios
- [ ] Se incluyen las validaciones especificadas
- [ ] Se agrega documentación JavaDoc básica

#### Notas Adicionales
- Considerar agregar constantes para los valores mínimos/máximos
- Incluir mensajes de error descriptivos en las validaciones

### Labels
- `enhancement`
- `good first issue`

### Asignación
- Milestone: `Etapa 1 - Clases básicas`
- Project: `Sistema de Gestión de Vehículos`
- Estado: `To Do`

## ✅ Requisitos para la entrega final

- ✅ Todos los Issues cerrados
- ✅ Todos los Milestones completos
- ✅ Todos los PRs revisados y mergeados
- ✅ Project con todas las tareas en `Done`
- ✅ Este archivo `README.md` completo con:
  - Nombre y apellido del alumno
  - Instrucciones detalladas de cómo ejecutar el proyecto
  - Requisitos previos (JDK, IDE, etc.)
  - Pasos para compilar y ejecutar
  - Ejemplos de uso

> ⏰ **Fecha de vencimiento**: 09/04/2025 a las 13:00 hs

---

## 👨‍🎓 Alumno

- **Nombre y Apellido:** Agustin Benavidez
- **Legajo:** 62344

---

## 🚀 Ejecución del Proyecto

### Requisitos Previos

- **Java Development Kit (JDK):** Versión 8 o superior instalada. Puedes verificar tu versión con `java -version` en la terminal.
- **Git:** Necesario para clonar el repositorio. [https://git-scm.com/](https://git-scm.com/)
- **IDE (Opcional pero recomendado):** Cualquier IDE de Java como IntelliJ IDEA, Eclipse, VS Code con extensiones de Java.

### Pasos para Compilar y Ejecutar (desde la Terminal)

1.  **Clonar el repositorio (si aún no lo has hecho):**
    ```bash
    git clone https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-abenavidezUM.git
    ```

2.  **Navegar al directorio del proyecto:**
    ```bash
    cd programacion-2-trabajo-practico-1-abenavidezUM
    ```

3.  **Compilar los archivos Java:**
    Desde el directorio raíz del proyecto (`programacion-2-trabajo-practico-1-abenavidezUM`), ejecuta:
    ```bash
    # Asegúrate de que la estructura de directorios src/main/java exista
    javac -d . src/main/java/com/gestionvehiculos/*.java
    ```
    *Nota: El `-d .` indica que las clases compiladas (`.class`) se guardarán manteniendo la estructura de paquetes a partir del directorio actual.* 

4.  **Ejecutar la clase principal:**
    ```bash
    java com.gestionvehiculos.Main
    ```

### Ejecución desde un IDE

1.  Clona el repositorio o impórtalo como un proyecto existente en tu IDE preferido.
2.  Asegúrate de que el IDE reconozca la estructura del proyecto (marcando `src/main/java` como la carpeta fuente si es necesario).
3.  Localiza la clase `com.gestionvehiculos.Main`.
4.  Haz clic derecho sobre `Main.java` y selecciona la opción "Run" o "Ejecutar".

### Ejemplo de Salida Esperada

La ejecución del programa debería mostrar una salida similar a la siguiente en la consola:

```
Iniciando sistema de gestión de vehículos (Etapa 5 - ArrayList)...
Creando y añadiendo vehículos a la flota...
- Añadido: Vehículo Toyota
- Añadido: Camión Scania
- Añadido: Auto Fiat
- Añadido: Auto Peugeot
- Añadido: Camión Volvo

...Vehículos añadidos.

--- Imprimiendo información de la Flota Completa ---
--- Información del Vehículo ---
Patente: AB123CD
Marca: Toyota
Año: 2020
Capacidad de Carga (Kg): 500.0
-------------------------------------
--- Información del Vehículo ---
Patente: XYZ789
Marca: Scania
Año: 2019
Capacidad de Carga (Kg): 12000.0
Tiene Acoplado: Sí
-------------------------------------
--- Información del Vehículo ---
Patente: AC345FG
Marca: Fiat
Año: 2021
Capacidad de Carga (Kg): 150.0
Cantidad de Pasajeros: 5
-------------------------------------
--- Información del Vehículo ---
Patente: BD678HI
Marca: Peugeot
Año: 2023
Capacidad de Carga (Kg): 180.0
Cantidad de Pasajeros: 4
-------------------------------------
--- Información del Vehículo ---
Patente: UVW456
Marca: Volvo
Año: 2021
Capacidad de Carga (Kg): 10000.0
Tiene Acoplado: No
-------------------------------------
--- Fin de la impresión de la Flota ---

...Finalizando sistema.
```

---

## 📝 Licencia

Este trabajo es parte del curso de Programación 2 de Ingeniería en Informática. Uso educativo únicamente.
