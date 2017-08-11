package Codeit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(format = "pretty", 
	        snippets = SnippetType.CAMELCASE, 
	        features="src/test/resources/features/consultaUnitaria",
	        tags = "@Calculadora")
	
	public class CalculadoraSuiteTests {

	}