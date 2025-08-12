# Dias-semana-app

![Java CI with Maven](https://github.com/VanderleneO/JavaList)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## 🌟 Visión General

`dias-semana-app` es un proyecto de ejemplo que explora la implementación del patrón de diseño **Modelo-Vista-Controlador (MVC)** en Java. Utiliza **Maven** para la gestión de dependencias y **JUnit 5** para los tests unitarios, asegurando una base de código sólida y fácil de mantener.

### Características clave:
* **Estructura MVC**: Separación clara de responsabilidades entre Modelos, Vistas y Controladores.
* **Gestión de colecciones**: Manipulación de una lista de objetos `DiaSemana` utilizando la interfaz `java.util.List`.
* **Tests unitarios**: Cobertura de tests para la lógica de negocio en el controlador.
* **Build tool**: Configurado con Maven para una fácil compilación y ejecución.

## 🚀 Empezando

### Pre requisitos

Asegúrate de tener instalado lo siguiente:

* **JDK 21+** (o la versión que uses en `pom.xml`)
* **Maven 3.6+**

### Instalación

1.  Clona el repositorio:
    ```bash
    git clone [https://github.com/tu-usuario/tu-repositorio.git](https://github.com/tu-usuario/tu-repositorio.git)
    cd dias-semana-app
    ```
2.  Compila el proyecto y ejecuta los tests:
    ```bash
    mvn clean install
    ```

### Ejecución

Para ejecutar la aplicación principal desde la línea de comandos:

```bash
mvn exec:java -Dexec.mainClass="mi.semana.App"

Alternativamente, puedes abrir el proyecto en un IDE como Visual Studio Code, IntelliJ IDEA o Eclipse y ejecutar App.java directamente.

🧪 Testing
Este proyecto incluye tests unitarios para el ControladorSemana. Para ejecutarlos, usa el siguiente comando:

Bash

mvn test
Los resultados detallados de los tests se mostrarán en la consola.

🏛️ Arquitectura del Proyecto
El proyecto está diseñado siguiendo el patrón MVC, con una clara separación de componentes:

model/: Contiene la clase DiaSemana.java (POJO), que define la estructura de datos.

view/: Contiene la clase VistaSemana.java, responsable de la interacción con el usuario (impresión en consola).

controller/: Contiene la clase ControladorSemana.java, que encapsula la lógica de negocio y coordina la interacción entre el modelo y la vista.

🤝 Contribuciones
Si quieres contribuir, ¡serás bienvenido! Para ello, sigue los siguientes pasos:

Haz un "fork" del repositorio.

Crea una rama para tu funcionalidad (git checkout -b feature/nueva-funcionalidad).

Commitea tus cambios (git commit -am 'feat: Agrega nueva funcionalidad').

Empuja tus cambios a la rama (git push origin feature/nueva-funcionalidad).

Crea un nuevo "Pull Request".

📄 Licencia
Este proyecto está bajo la Licencia MIT - ver el archivo LICENSE.md para más detalles.

