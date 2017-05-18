package Codeit.steps.serenity;

import Codeit.pages.SeguradoraPage;
import net.thucydides.core.annotations.Step;

public class SeguradoraSteps {

	SeguradoraPage seguradoraPage;
	
	@Step
	public void abrirPagina(String texto){
		seguradoraPage.open();
		seguradoraPage.textoSolicitado(texto);
	}
	
	@Step
	public void textoSolicitado(String texto){
		seguradoraPage.clickLinkSelecionado(texto);
	}
	
	@Step
	public void assertExisteTexto(String texto){
		seguradoraPage.assertExisteTexto(texto);
	}
	
}
