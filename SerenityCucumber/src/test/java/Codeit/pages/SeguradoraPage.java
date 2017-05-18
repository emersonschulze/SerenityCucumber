package Codeit.pages;

import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.google.com.br")
public class SeguradoraPage extends PageObject {
	
		@FindBy(name="q")
	    private WebElement campoBusca;
		
		@FindBy(className="title")
	    private WebElement contemTexto;
	    
	    public void clickLink(String keyword) {
	      clickLink(keyword);
	    }
	    
	    public void abrirHome() {
		   	open();
		 }

	    public void textoSolicitado(String texto) {
	        campoBusca.sendKeys(texto);
	        campoBusca.submit();
	    }

	    public void clickLinkSelecionado(String link) {
	    	getDriver().findElement(By.linkText(link)).click();
	    }

	    public void assertExisteTexto(String term) {
	    assertThat("Comtem o texto", contemTexto.getText().contains(term));;   
	    
	    }
	}