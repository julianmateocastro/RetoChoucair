#Author: Julian Castro
# language: es

@HUCONTRATACION
Característica: Validar la contratación de un empleado
  COMO administrador
  QUIERO poder contratar un empleado
  PARA que pueda trabajar en la empresa

  Antecedentes:
    Dado que el usuario se loguee en el sistema
      | nombreUsuario  | contrasenna |
      | admin | admin123 |
    Y pueda seleccionar la opción Recruitment


    @CP001
    Escenario: Contratar un empleado
      Dado que el usuario seleccione el botón Add
      Cuando complete los campos primer nombre, segundo nombre y apellido
      | primerNombre | segundoNombre | apellido |
      | aleatorio | aleatorio | aleatorio |
      Y seleccione una vacante
        | vacante |
        |Payroll Administrator |
       Y ingrese datos de contacto correo y numero
        | correo | numeroContacto |
        | aleatorio  | aleatorio |
      Y información de interés general
        | archivo | palabrasClave|fechaAplicacion |notas |
        | archivo.txt | aleatorio |aleatorio |aleatorio |
      Y seleccione la casilla de verificación
        | casillaVerificacion |
          | true |
      Y seleccione el botón Guardar
      Y selecciona el botón lista corta
      Y ingresar notas
        | notas |
        | aleatorio |
      Y seleccione el botón Guardar
      Y selecciona el botón programar entrevista
      Y ingresa el titulo de la entrevista, nombre del entrevistador, date y hora
        | tituloEntrevista |entrevistador|fecha|hora|minuto|formato|
        | aleatorio |       aleatorio |           aleatorio|aleatorio|aleatorio|am|
      Y ingresar notas
        | notas |
        | aleatorio |
      Y seleccione el botón Guardar
      Y selecciona el botón entrevista aprobada
      Y ingresar notas
        | notas |
        | aleatorio |
      Y seleccione el botón Guardar
      Y selecciona el botón ofrecer trabajo
      Y ingresar notas
        | notas |
        | aleatorio |
      Y seleccione el botón Guardar
      Y selecciona el botón contratado
      Y ingresar notas
        | notas |
        | aleatorio |
      Y seleccione el botón Guardar
      Y obtiene el gerente de contratación y el estado del candidato
      Y selecciona el botón reclutamiento
      Y selecciona el nombre del candidato
      Y selecciona el botón buscar
      Entonces valida la información del candidato




