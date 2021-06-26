Feature: Verificacao dos triangulos

  Scenario: Lados inseridos pelo usuario nao correspondem a um triangulo
    Given que o triangulo esteja inicializado
    When digita os valores 1, 5, 7 para os lados
    Then o programa alerta que os lados nao correspondem a um triangulo

  Scenario: Lados inseridos pelo usuario correspondem a um triangulo equilatero
    Given que o triangulo esteja inicializado
    When digita os valores 3, 3, 3 para os lados
    Then o programa alerta que os lados correspondem a um triangulo equilatero

  Scenario: Lados inseridos pelo usuario correspondem a um triangulo isosceles
    Given que o triangulo esteja inicializado
    When digita os valores 4, 4, 5 para os lados
    Then o programa alerta que os lados correspondem a um triangulo isosceles

  Scenario: Lados inseridos pelo usuario correspondem a um triangulo escaleno
    Given que o triangulo esteja inicializado
    When digita os valores 3, 4, 5 para os lados
    Then o programa alerta que os lados correspondem a um triangulo escaleno