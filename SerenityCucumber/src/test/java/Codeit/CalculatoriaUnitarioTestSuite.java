package Codeit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(SerenityRunner.class)
@CucumberOptions(features = "classpath:features/consultaUnitaria", tags = "@Caculadora")
public class CalculatoriaUnitarioTestSuite {
	

}
