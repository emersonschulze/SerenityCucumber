package Codeit.steps;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import Business.Calculadora;
import Business.CalculadoraImpl;
import Business.Operador;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculadoraTests {
	
	 private int valor1 = 0;
	    private int valor2 = 0;
	    private int resultado = 0;
	    private Calculadora calculadora = new CalculadoraImpl();

	    @Before 
		 public void setUp(){ 
			
		 } 
	    
	    @Given("^eu tenho o numero (\\d+) e (\\d+)$")
	    public void euTenhoONumeroE(int arg1, int arg2) throws Throwable {

	        valor1 = arg1;
	        valor2 = arg2;
	    }

	    @When("^eu quero somar$")
	    public void euQueroSomar() throws Throwable {
	       this.resultado = calculadora.calcular(Operador.SOMAR, valor1, valor2);
	    }

	    @When("^eu quero subtrair$")
	    public void euQueroSubtrair() throws Throwable {
	        this.resultado = calculadora.calcular(Operador.SUBTRAIR, valor1, valor2);
	    }

	    @When("^eu quero multiplicar$")
	    public void euQueroMultiplicar() throws Throwable {
	        this.resultado = calculadora.calcular(Operador.MULTIPLICAR, valor1, valor2);
	    }

	    @When("^eu quero dividir$")
	    public void euQueroDividir() throws Throwable {
	        this.resultado = calculadora.calcular(Operador.DIVIDIR, valor1, valor2);
	    }

	    @Then("^eu quero como resultado o numero (\\d+)$")
	    public void euQueroComoResultadoONumero(int resultadoEXperado) throws Throwable {

	        assertThat(resultado, is(resultadoEXperado));

	    }
	}