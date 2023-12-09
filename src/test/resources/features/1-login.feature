@Suite @login
Feature: CP01 - Validar inicio de sesion

  Background: Validar el inicio de sesion con dredenciales validas e invalidas

    Given el usuario navega al sitio web

    @ValidCredentials
    Scenario: 1 - Validar con credenciales correctas
      When Ingresa credenciales validas
      Then la aplicacion deberia mostrar el modulo principal de productos
    @InvalidCredentials
    Scenario: 2 - Validar con credenciales incorrectas
      When Ingresa credenciales invalidas
      Then La aplicacion deberia mostrar un mensaje de error
