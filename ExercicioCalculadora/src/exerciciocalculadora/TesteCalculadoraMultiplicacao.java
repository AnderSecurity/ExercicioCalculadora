package exerciciocalculadora;

public class TesteCalculadoraMultiplicacao {

    public static void main(String[] args) {
        
        Calculadora calculadoraMultiplicacao = new Calculadora(new Calculadora.Multiplicacao());
        
        //Cenário de teste 1: Multiplicação de dois valores.
        double resultMultiplicacao = calculadoraMultiplicacao.calcularOperacao(5, 3);
        System.out.println("Multiplicação: " + resultMultiplicacao);
        
        //Cenário de teste 2: Multiplicação de dois valores sendo um zero.
        resultMultiplicacao = calculadoraMultiplicacao.calcularOperacao(3, 0);
        System.out.println("Multiplicação: " + resultMultiplicacao);
        
        //Cenário de teste 3: Multiplicação de dois valores sendo ambos zero.
        resultMultiplicacao = calculadoraMultiplicacao.calcularOperacao(0, 0);
        System.out.println("Multiplicação: " + resultMultiplicacao);
        
        //Cenário de teste 4: Multiplicação de dois valores sendo um negativo.
        resultMultiplicacao = calculadoraMultiplicacao.calcularOperacao(-3, 2);
        System.out.println("Multiplicação: " + resultMultiplicacao);
        
        //Cenário de teste 5: Multiplicação de dois valores sendo um negativo e um 0.
        resultMultiplicacao = calculadoraMultiplicacao.calcularOperacao(-3, 0);
        System.out.println("Multiplicação: " + resultMultiplicacao);
        
    }
    
}
