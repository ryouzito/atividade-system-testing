@executeCrud
Feature: Crud process

  Background:
    Given user would like to create a process
    And user clicks on New Process button
    And user fills vara equal "Vara"
    And user fills numero equal "123456"
    And user fills natureza equal "Guarda"
    And user fills partes equal "DC x Marvel"
    And user selects urgency equal "Sim"
    And user clicks on abritramento equal "Sim"
    And user fills assistente equal "Tony Stark"
    And user fills entrada equal "01/01/2000"
    And user fills saida equal "01/11/2008"
    And user fills agendamento equal "12/07/1998"
    And user fills status equal "Finalizado"
    And user fills observacao equal "Marvel wins"
    When the user clicks on save button

  Scenario: User creates a process
    Then the user should see "Processo foi criado com sucesso." into process page
    And the user should see the code for the created process

  Scenario: User reads last created process
    Given the user should see the code for the created process
    When the user clicks on back button
    And the user clicks on show button
    Then the user should see the code for the created process

  Scenario Outline: User updates process
    Given the user should see the code for the created process
    And the user clicks on update button
    And user fills assistente equal "<assistente>"
    And user fills observacao equal "<observacao>"
    When the user clicks on save button
    Then the user should see "Processo atualizado com sucesso." into process page
    And the user should see the code for the created process

    Examples:
      | assistente    | observacao                        |
      | Homem Aranha  | Herois devem revelar a identidade |
      | Batman        | Mamae!                            |
      | Hulk          | SMASH!                            |

  Scenario: User deletes process
    Given the user should see the code for the created process
    When the user clicks on back button
    And the user clicks on delete button
    Then the user confirms delete