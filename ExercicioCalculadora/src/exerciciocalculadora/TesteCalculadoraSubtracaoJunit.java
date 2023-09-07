package exerciciocalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraSubtracaoJunit {

    @Test
    public static void SubtrairDoisNumerosPositivos() {
        Calculadora calculadoraSubtracao = new Calculadora(new Calculadora.Subtracao());
        int subtracao = calculadoraSubtracao.calcularOperacao(10, 7);  
        assertEquals(subtracao,3);
    }
    
}
