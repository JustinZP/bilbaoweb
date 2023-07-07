Feature: Editar empleado
  Scenario: Editar información de un empleado existente
    Given un empleado con DNI "12345678"
    When se edita el nombre a "John" y el apellido a "Doe"
    Then la consulta SQL generada debe ser "UPDATE tbempleado SET nombre='John' apellido='Doe' direccion='[dirección actual]' where dni='12345678'"

  Scenario: Error al editar un empleado
    Given un empleado con DNI "12345678"
    When se edita el nombre a "" y el apellido a "Doe"
    Then la consulta SQL generada no debe ser ejecutada y se debe retornar falso
