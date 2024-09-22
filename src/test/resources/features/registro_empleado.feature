#language: es
Característica: contratacion de empleado

  Esquema del escenario: : contratacion de empleado exitoso
    Dado el usuario inicia sesion en la pagina con las credenciales "<usuario>" "<contrasena>"
    Cuando el usuario llena los formularios de registro "<primerNombre>" "<segundoNombre>" "<apellido>" "<email>"
    Y el usuario llena los formularios adicionales "<tituloEntrevista>" "<entrevistador>" "<fecha>"
    Entonces el usuario logra visualizar la contratacion del empleado
    Ejemplos:
      | usuario | contrasena | primerNombre | segundoNombre | apellido | email                 | tituloEntrevista         | entrevistador      | fecha      |
      | Admin   | admin123   | Jhon         | Edison        | Cano     | jhoncano112@gmail.com | Entrevista automatizador | Peter  | 2024-23-09 |