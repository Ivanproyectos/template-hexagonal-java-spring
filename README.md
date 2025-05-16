# Ejemplo de Arquitectura Hexagonal en Java con Spring Boot

Este proyecto es un ejemplo práctico y sencillo para entender y aplicar la **Arquitectura Hexagonal (Ports and Adapters)** usando Java y Spring Boot. Está pensado para desarrolladores que comienzan a trabajar con arquitectura limpia, DDD y patrones modernos en el ecosistema Java.

---

## 🚀 ¿Qué encontrarás en este proyecto?

- **Estructura modular y limpia** siguiendo la arquitectura hexagonal, separando claramente las capas de dominio, aplicación e infraestructura.
- **Modelo de dominio** con entidades y lógica de negocio (Product y Category).
- **Implementaciones de adaptadores** para persistencia en memoria y base de datos MySQL con Spring Data JPA.
- **Validación de entradas** con anotaciones estándar de Bean Validation (Jakarta Validation).
- **Mapeo de objetos** con MapStruct para transformar entre entidades, modelos y DTOs.
- Aplicación de **principios SOLID** y buenas prácticas para mantener el código desacoplado y testable.
- Uso de **DTOs específicos para request y response**, modularizando los contratos de entrada y salida.
- Configuración del proyecto con **Maven**.

## 📚 Descripción de las capas

- **Dominio:** Aquí están las entidades y interfaces que representan las reglas y lógica de negocio pura. Esta capa no depende de ningún framework.
- **Aplicación:** Contiene casos de uso, servicios, DTOs de entrada y salida, validaciones y mapeos entre modelos y DTOs.
- **Infraestructura:** Configuraciones, adapters y implementaciones concretas de puertos (por ejemplo, repositorios de datos). Aquí se manejan detalles como JPA, conexiones a BD, o almacenamiento en memoria clases relacionadas con Spring Boot, seguridad, configuración de beans, etc.

---

## ✔️ Buenas prácticas y tecnologías aplicadas

- **Separación clara de responsabilidades** para facilitar el mantenimiento y escalabilidad.
- Uso de **DTOs específicos** para cada operación (crear, actualizar, listar).
- Validación declarativa con **Bean Validation (Jakarta Validation)**.
- Mapeo automático y limpio con **MapStruct**.
- Aplicación de **principios SOLID** para un diseño flexible.
- Arquitectura modular para facilitar **pruebas unitarias y de integración**.

---


### Requisitos

- Java 17 o superior
- Maven 3.6+
- MySQL (si usas la persistencia con base de datos)
- IDE como IntelliJ IDEA, Eclipse o VSCode

### Pasos para clonar

```bash
git clone https://github.com/Ivanproyectos/template-hexagonal-java-spring.git

cd hexagonal-modules-v1

# Para compilar el proyecto
mvn clean install

```

# Para ejecutar la aplicación Spring Boot
crea una configuracion de ejecución 