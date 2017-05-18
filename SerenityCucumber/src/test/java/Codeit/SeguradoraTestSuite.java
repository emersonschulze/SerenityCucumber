package Codeit;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features/consulta", tags = "@BuscaSeguradora")
public class SeguradoraTestSuite {
	

}
