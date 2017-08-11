package Business;

import java.util.HashMap;

import Business.Operacoes.Dividir;
import Business.Operacoes.Multiplicar;
import Business.Operacoes.Operacao;
import Business.Operacoes.Somar;
import Business.Operacoes.Subtrair;

public class CalculadoraImpl  implements Calculadora {

    private HashMap<Operador,Operacao> operacoes = new HashMap<Operador, Operacao>();
    
    public CalculadoraImpl(){
        
    	operacoes.put(Operador.SOMAR, new Somar());
    	operacoes.put(Operador.SUBTRAIR, new Subtrair());
    	operacoes.put(Operador.DIVIDIR, new Dividir());
    	operacoes.put(Operador.MULTIPLICAR, new Multiplicar());
        
    }
    
    @Override
    public int calcular(Operador operador, int valor1, int valor2) {
        return operacoes.get(operador).executar(valor1, valor2);
        
    }
}