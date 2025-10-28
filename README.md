##Descripción del proyecto##

Este proyecto es un ejemplo práctico de CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Hibernate ORM con Java y MySQL. Su objetivo principal es demostrar cómo mapear una entidad Java a una tabla de base de datos, gestionar la persistencia de datos y realizar operaciones básicas de manera sencilla y eficiente.

**_El proyecto incluye:_**

Una clase Usuario, que representa la entidad en la base de datos con campos como id, nombre, apellido y direccion.
Un controlador (UsuarioController) que implementa los métodos CRUD: crear, consultar, actualizar y eliminar usuarios.
Una clase de vista (UsuarioView) que permite probar las operaciones CRUD y ver los resultados directamente en la consola.
La configuración de Hibernate (hibernate.cfg.xml), donde se define la conexión a la base de datos, el dialecto de SQL y parámetros importantes para la gestión de sesiones.
Dependencias gestionadas mediante Maven (pom.xml), incluyendo Hibernate y el conector de MySQL.

**_El proyecto sirve como ejemplo educativo para entender:_**

Cómo conectar una aplicación Java a una base de datos MySQL.
Cómo mapear clases Java a tablas usando anotaciones JPA (@Entity, @Table, @Id, @Column).
Cómo realizar operaciones CRUD con Hibernate mediante SessionFactory y Session.
La importancia de la configuración de Hibernate y el manejo de transacciones en aplicaciones Java.

Este proyecto es un ejemplo de CRUD con Hibernate, Java y MySQL. Permite manejar usuarios en la base de datos de forma sencilla.

- 📂 **Estructura del proyecto:**
  - `controllers/UsuarioController.java` – Implementa las operaciones CRUD.
  - `models/Usuario.java` – Entidad JPA mapeada a la tabla `usuarios`.
  - `view/UsuarioView.java` – Clase principal para probar el proyecto.
  - `hibernate.cfg.xml` – Configuración de Hibernate.
  - `pom.xml` – Gestión de dependencias con Maven.

- ⚙️ **Configuración de Hibernate (`hibernate.cfg.xml`):**
  - `connection.driver_class` – Driver JDBC de MySQL.
  - `connection.url` – URL de conexión con la base de datos.
  - `connection.username` / `connection.password` – Credenciales de MySQL.
  - `dialect` – Dialecto de MySQL usado por Hibernate.
  - `hibernate.show_sql` – Muestra las consultas SQL en la consola.

-  **Notas importantes:**
  - La clase `Usuario` necesita un constructor vacío.
  - Todos los métodos CRUD usan `SessionFactory` y `Session`.
  - Se recomienda un pool de conexiones real para producción.
 
**_Es ideal para principiantes que quieren aprender Hibernate y entender la interacción entre Java y bases de datos relacionales mediante ejemplos concretos y funcionales._**

