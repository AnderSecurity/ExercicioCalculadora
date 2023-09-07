package exerciciocalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraMultiplicacaoJunit {

    @Test
    public static void MultiplicarDoisNumerosPositivos() {
        Calculadora calculadoraMultiplicacao = new Calculadora(new Calculadora.Multiplicacao());
        int multiplicacao = calculadoraMultiplicacao.calcularOperacao(10, 5);  
        assertEquals(multiplicacao,50);
        
    }
    
}
