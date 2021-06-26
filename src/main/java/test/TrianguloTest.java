package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import triangulo.Triangulo;

@DisplayName("Classe que testa o triangulo")
public class TrianguloTest {
    Triangulo triangulo;
    String tipo;

    public void chamaVerifTriangulo(int a, int b, int c) {
        tipo = triangulo.verificaTriangulo(a, b, c);
    }

    @Given("que o triangulo esteja inicializado")
    public void initTriangulo() {
        triangulo = new Triangulo();
    }

    @When("digita os valores 1, 5, 7 para os lados")
    public void entradaNaoTriangulo() {
        chamaVerifTriangulo(1, 5, 7);
    }

    @Then("o programa alerta que os lados nao correspondem a um triangulo")
    public void naoEhTriangulo() {
        Assertions.assertEquals(tipo, "Nao eh um triangulo");
    }

    @When("digita os valores 3, 3, 3 para os lados")
    public void entradaTrianguloEquilatero() {
        chamaVerifTriangulo(3, 3, 3);
    }

    @Then("o programa alerta que os lados correspondem a um triangulo equilatero")
    public void ehTrianguloEquilatero() {
        Assertions.assertEquals("O triangulo eh equilatero", tipo);
    }

    @When("digita os valores 4, 4, 5 para os lados")
    public void entradaTrianguloIsosceles() {
        chamaVerifTriangulo(4, 4, 5);
    }

    @Then("o programa alerta que os lados correspondem a um triangulo isosceles")
    public void ehTrianguloIsosceles() {
        Assertions.assertEquals("O triangulo eh isosceles", tipo);
    }

    @When("digita os valores 3, 4, 5 para os lados")
    public void entradaTrianguloEscaleno() {
        chamaVerifTriangulo(3, 4, 5);
    }

    @Then("o programa alerta que os lados correspondem a um triangulo escaleno")
    public void ehTrianguloEscaleno() {
        Assertions.assertEquals("O triangulo eh escaleno", tipo);
    }

}
