package exerciciocalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraDivisaoJunit{

    @Test
    public static void DividirDoisNumerosPositivos() {
        Calculadora calculadoraDivisao = new Calculadora(new Calculadora.Divisao());
        int divisao = calculadoraDivisao.calcularOperacao(10, 2);  
        assertEquals(divisao,5);
    }
}
