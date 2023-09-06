package exerciciocalculadora;

public class TesteCalculadoraSubtracao {

    public static void main(String[] args) {
        
         Calculadora calculadoraSubtracao = new Calculadora(new Calculadora.Subtracao());
        
        //Cenário de teste 1: Subtração de dois valores.
        double resultSubtracao = calculadoraSubtracao.calcularOperacao(5, 3);
        System.out.println("Subtracao: " + resultSubtracao);
        
        //Cenário de teste 2: Subtração de dois valores sendo um zero.
        resultSubtracao = calculadoraSubtracao.calcularOperacao(3, 0);
        System.out.println("Subtracao: " + resultSubtracao);
        
        //Cenário de teste 3: Subtração de dois valores sendo ambos zero.
        resultSubtracao = calculadoraSubtracao.calcularOperacao(0, 0);
        System.out.println("Subtracao: " + resultSubtracao);
        
        //Cenário de teste 4: Subtração de dois valores sendo um negativo.
        resultSubtracao = calculadoraSubtracao.calcularOperacao(-3, 2);
        System.out.println("Subtracao: " + resultSubtracao);
        
        //Cenário de teste 5: Subtração de dois valores sendo um negativo e um 0.
        resultSubtracao = calculadoraSubtracao.calcularOperacao(-3, 0);
        System.out.println("Subtracao: " + resultSubtracao);
        
        //Cenário de teste 6: Subtração de dois valores sendo os dois negativos.
        resultSubtracao = calculadoraSubtracao.calcularOperacao(-3, -5);
        System.out.println("Subtracao: " + resultSubtracao);
    }
    
}
