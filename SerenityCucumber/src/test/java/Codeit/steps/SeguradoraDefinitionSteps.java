package Codeit.steps;

import Codeit.steps.serenity.SeguradoraSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SeguradoraDefinitionSteps {

	 @Before 
	 public void setUp(){ 
		 seguradora.abrirPagina("Sulámerica");
	 } 
	
	@Steps
	public SeguradoraSteps seguradora;
	  
	@Given("a pesquisa clico no link '(.*)'")
	public void a_pesquisa_clico_no_link_SulAmérica_Seguro_de_Vida_Auto_Saúde_Residencial_e_Previdência(String texto) {
		seguradora.textoSolicitado(texto);
	}

	@When("ao acessar a pagina encontro o texto '(.*)'")
	public void ao_acessar_a_pagina_encontro_o_texto_PEÇA_PARA_O_SEU_CORRETOR_OU_SOLICITE_UMA_COTAÇÃO(String texto) {
		seguradora.assertExisteTexto(texto);
	}

	@Then("e verifico que contém o a informação de '(.*)'")
	public void e_verifico_que_contém_o_a_informação_de_DESCONTÔMETRO(String texto) {
		seguradora.assertExisteTexto(texto);
	}

}
