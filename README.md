# ✨ Proyecto: Spring Boot Beans - Ejemplo para Entrevistas Técnicas

Este repositorio contiene un **ejemplo práctico de Beans en Spring Boot**, incluyendo el uso de `@Component`, `@Service`, `@Configuration` y `@Bean`. Diseñado para ayudar a entender el concepto de **inyección de dependencias** y **inversión de control** en entornos de entrevistas técnicas.

## ✨ Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.4.2**
- **Maven**
- **Spring Boot Starter Web** (Para una aplicación web sencilla)
- **Spring Boot Starter Data JPA** (Opcional, pero agregado en el `pom.xml`)
- **H2 Database** (Base de datos en memoria para pruebas, opcional)
- **Lombok** (Para reducir código boilerplate)

## 🛠️ Instalación y Uso

### 1. Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/spring-boot-beans.git
cd spring-boot-beans
```

### 2. Construir el proyecto con Maven
```bash
mvn clean install
```

### 3. Ejecutar la aplicación
```bash
mvn spring-boot:run
```

La aplicación estará corriendo en: **http://localhost:8081/**

## 🌟 Contribuir

Si quieres contribuir, puedes hacer un **Fork** y luego crear un **Pull Request**:
1. Realiza un **Fork** del repositorio.
2. Clona tu fork localmente.
3. Crea una rama para tu cambio:
   ```bash
   git checkout -b mi-nueva-caracteristica
   ```
4. Realiza los cambios y sube el código a tu fork.
5. Crea un Pull Request en GitHub explicando tus cambios.

---

## 🔍 Preguntas y Respuestas para Entrevistas Técnicas

### 1. ¿Qué es un **Bean** en Spring?
Un **Bean** es un objeto administrado por el contenedor de Spring. Se encarga de su ciclo de vida y permite la inyección de dependencias de manera automática.

### 2. ¿Cuáles son las principales formas de definir un Bean en Spring?
- **Con `@Component` o `@Service`**: Spring detecta automáticamente la clase y la registra como Bean.
- **Mediante `@Bean` en una clase `@Configuration`**: Se define un Bean de forma manual.

### 3. ¿Qué es la **Inyección de Dependencias (DI)**?
Es un patrón de diseño en el que Spring se encarga de **inyectar** los objetos (dependencias) en lugar de que el desarrollador los cree manualmente. Esto facilita la modularidad y las pruebas.

### 4. ¿Cuál es la diferencia entre `@Component`, `@Service` y `@Repository`?
- **`@Component`**: Marca una clase genérica como Bean de Spring.
- **`@Service`**: Especialización de `@Component` para la capa de servicio (lógica de negocio).
- **`@Repository`**: Especialización de `@Component` para la capa de persistencia (DAO), maneja excepciones automáticamente.

### 5. ¿Qué es la **Inversión de Control (IoC)**?
Es un principio en el que el control de la creación y gestión de objetos lo tiene el **contenedor de Spring** y no el desarrollador.

### 6. ¿Cómo se obtiene un Bean manualmente en Spring?
Se puede usar `ApplicationContext` para obtener un Bean:
```java
@Autowired
private ApplicationContext context;

String exampleBean = context.getBean(String.class);
```

### 7. ¿Qué es el **ciclo de vida de un Bean** en Spring?
Los Beans en Spring tienen un ciclo de vida que incluye:
1. **Creación** (cuando el contenedor los detecta o los solicita).
2. **Inicialización** (`@PostConstruct` o `InitializingBean`).
3. **Uso**.
4. **Destrucción** (`@PreDestroy` o `DisposableBean`).

### 8. ¿Qué es el `@Scope` en Spring?
Define el alcance de un Bean. Ejemplos:
- `@Scope("singleton")` (Por defecto): Un único Bean compartido en toda la aplicación.
- `@Scope("prototype")`: Se crea una nueva instancia cada vez que se solicita.

---

## 📈 Recursos Adicionales
- [Documentación Oficial de Spring](https://spring.io/projects/spring-boot)
- [Guía de Inyección de Dependencias en Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)

---

Creado por **@afernandez** - Para entrevistas técnicas 📚

