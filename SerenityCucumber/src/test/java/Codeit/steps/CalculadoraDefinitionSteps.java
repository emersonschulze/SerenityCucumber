package Codeit.steps;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Codeit.steps.serenity.CalculadoraSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

public class CalculadoraDefinitionSteps {
	
	@Steps
	public CalculadoraSteps calculadora;
	  
	private Integer valorA;
	private Integer valorB;

	private Integer resultado;
	
	@Test
	@Dado("^o numero '(\\d+)'$")
	public void o_numero(int arg1)  {
		valorA = arg1;
	}

	@Test
	@Quando("^Temos o número '(\\d+)'$")
	public void temos_o_número(int arg1)  {
		valorB = arg1;
	}

	@Test
	@Entao("^temos o resultado da adicao '(\\d+)'$")
	public void temos_o_resultado_da_adicao(int arg1) {
		resultado = calculadora.somar(valorA, valorB);
		assertTrue(resultado.equals(arg1));
	}

	@Test
	@Entao("^Temos o resultado da subtracao '(\\d+)'$")
	public void temos_o_resultado_da_subtracao(int arg1) {
		resultado = calculadora.subtrair(valorA, valorB);
		assertTrue(resultado.equals(arg1));
	}

	@Test
	@Entao("^Temos o resultado da multiplicacao '(\\d+)'$")
	public void temos_o_resultado_da_multiplicacao(int arg1)  {
		resultado = calculadora.multiplicar(valorA, valorB);
		assertTrue(resultado.equals(arg1));
	}

	@Test
	@Entao("^Temos o resultado da divisao'(\\d+)'$")
	public void temos_o_resultado_da_divisao(int arg1)  {
		resultado = calculadora.dividir(valorA, valorB);
		assertTrue(resultado.equals(arg1));
	}
}
