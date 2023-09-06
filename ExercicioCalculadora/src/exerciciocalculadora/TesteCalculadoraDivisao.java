package exerciciocalculadora;

public class TesteCalculadoraDivisao {

    public static void main(String[] args) {
        
        Calculadora calculadoraDivisao = new Calculadora(new Calculadora.Divisao());
        
        //Cenário de teste 1: Divisão de dois valores.
        double resultDivisao = calculadoraDivisao.calcularOperacao(5, 3);
        System.out.println("Divisão: " + resultDivisao);
        
        //Cenário de teste 2: Divisão de dois valores sendo um zero.
        resultDivisao = calculadoraDivisao.calcularOperacao(3, 0);
        System.out.println("Divisão: " + resultDivisao);
        
        //Cenário de teste 3: Divisão de dois valores sendo ambos zero.
        resultDivisao = calculadoraDivisao.calcularOperacao(0, 0);
        System.out.println("Divisão: " + resultDivisao);
        
        //Cenário de teste 4: Divisão de dois valores sendo um negativo.
        resultDivisao = calculadoraDivisao.calcularOperacao(-3, 2);
        System.out.println("Divisão: " + resultDivisao);
        
        //Cenário de teste 5: Divisão de dois valores sendo um negativo e um 0.
        resultDivisao = calculadoraDivisao.calcularOperacao(-3, 0);
        System.out.println("Divisão: " + resultDivisao);
    }
    
}
