#Author: Jesús David Zaraza Toro

Feature: Como usuario de demoqa
  quiero seleccionar una fecha en date picker
  con el fin de verificar el correcto funcionamiento de la aplicación

  Scenario: Seleccionar una fecha en la opción de date picker
    Given que el usuario se encuentra en la página de date picker
    When el usuario selecciona la opción de Data And Time
    Then seleccionará un fecha
