package exerciciocalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraSomaJunit {

    @Test
    public static void SomarDoisNumerosPositivos() {
        Calculadora calculadoraSoma = new Calculadora(new Calculadora.Soma());
        int soma = calculadoraSoma.calcularOperacao(3, 7);  
        assertEquals(soma,10);
    }   
}
