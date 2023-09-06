package exerciciocalculadora;

public class TesteCalculadoraSoma {

    public static void main(String[] args) {
        
        Calculadora calculadoraSoma = new Calculadora(new Calculadora.Soma());
        
        //Cenário de teste 1: Soma de dois valores.
        double resultAdicao = calculadoraSoma.calcularOperacao(5, 3);
        System.out.println("Soma: " + resultAdicao);
        
        //Cenário de teste 2: Soma de dois valores sendo um zero.
        resultAdicao = calculadoraSoma.calcularOperacao(3, 0);
        System.out.println("Soma: " + resultAdicao);
        
        //Cenário de teste 3: Soma de dois valores sendo ambos zero.
        resultAdicao = calculadoraSoma.calcularOperacao(0, 0);
        System.out.println("Soma: " + resultAdicao);
        
        //Cenário de teste 4: Soma de dois valores sendo um negativo.
        resultAdicao = calculadoraSoma.calcularOperacao(-3, 2);
        System.out.println("Soma: " + resultAdicao);
        
        //Cenário de teste 5: Soma de dois valores sendo um negativo e um 0.
        resultAdicao = calculadoraSoma.calcularOperacao(-3, 0);
        System.out.println("Soma: " + resultAdicao);
    }   
}
