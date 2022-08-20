#Author: Jesús David Zaraza Toro

Feature: Como usuario de demoqa
  quiero interactuar con los 4 tipos de alerts
  con el fin de verificar el correcto funcionamiento de la aplicación

  Scenario: Seleccionar las cuatro alertas en la opción de alerts
    Given que el usuario se encuentra en la página de alerts
    When el usuario interactua con los cuatro tipos de alertas disponibles
    Then abrirá y cerrará correctamente cada alerta