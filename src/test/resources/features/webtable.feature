#Author: Jesús David Zaraza Toro

Feature: Como usuario de demoqa
  necesito adicionar y elimiar registros en webtables
  con el fin de verificar el correcto funcionamiento de la aplicación

  Background:
    Given que el usuario se encuentra en la página de web tables

  Scenario: Agregar un nuevo registro en la tabla de web tables
    When el usuario diligencia todos los campos del formulario de registro
    Then los datos se almacenarán correctamente en la tabla

  Scenario: Eliminar un registro existente en la tabla de web tables
    When el usuario da click en el boton eliminar
    Then el registro seleccionado se elimina correctamente de la tabla
