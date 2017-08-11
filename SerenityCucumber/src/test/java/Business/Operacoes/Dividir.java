package Business.Operacoes;

public class Dividir implements Operacao{

    @Override
    public int executar(int valor1, int valor2) {
       return valor1/valor2;
    }
    
}