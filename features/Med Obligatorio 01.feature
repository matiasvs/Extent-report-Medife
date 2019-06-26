Feature: Med 126 - Obligatorios 01 - Validar la lista desplegable del combo Tipo de Responsable

  Scenario Outline: Comportamiento
    Given Dado un usuario perfil xx conectado con lo siguientes datos
    And Usuario: <maru>
    And Pass: <452896633>    
    And la pantalla Alta de responsible de pago desplegada
    When seleciona el campo Tipo de Responsable
    When A Selecciono Empresa <tipoResponsable>
    
	Examples: 
      | tipoResponsable |
      | Empresa         |
      | Externo         |
      | Grupo           |
      | 12              |