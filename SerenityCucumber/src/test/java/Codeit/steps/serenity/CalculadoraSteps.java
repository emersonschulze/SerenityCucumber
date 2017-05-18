package Codeit.steps.serenity;

import Business.CalculadoraCore;
import net.thucydides.core.annotations.Step;

public class CalculadoraSteps {

	CalculadoraCore core;
	
	@Step
	public Integer somar(Integer valorA, Integer valorB){
		return core.somar(valorA, valorB);
	}
	
	@Step
	public Integer subtrair(Integer valorA, Integer valorB){
		return core.subtrair(valorA, valorB);
	}
	
	@Step
	public Integer dividir(Integer valorA, Integer valorB){
		return core.dividir(valorA, valorB);
	}
	
	@Step
	public Integer multiplicar(Integer valorA, Integer valorB){
		return core.multiplicar(valorA, valorB);
	}
}
