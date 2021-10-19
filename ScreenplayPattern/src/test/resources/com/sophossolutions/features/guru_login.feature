#Author: rigoberto.henao@sophossolutions.com
Feature: Realizar Login Guru
  Yo como automatizador 
  Necesito crear mi primera practica
  Para aprender a interactuar con aplicaciones Web

  Scenario: Iniciar Sesion Guru
    Given "Carlos" desea navegar a la pagina "http://demo.guru99.com/V4/index.php"
    When ingrensa nombre de usuario "mgr123" y password "mgr!23"
    Then valida que se presente el mensaje de bienvenida "Manger Id : mgr123"
