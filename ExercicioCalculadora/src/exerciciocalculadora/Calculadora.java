package exerciciocalculadora;

/**
 * Classe responsável pela criação da calculadora.
 * @author AnderSecurity
 * @since 07/11/2023
 * @version 2.0
 */
public class Calculadora {
    /**
     * Variável para receber o tipo de operação
     */
    private Operacao _operacao;
    
    public Calculadora(Operacao operacao) {
        this._operacao = operacao;
    }
    
    /**
     * Calcular os valores fornecidos.
     * @param a
     * @param b
     * @return resultado do cálculo dos valores e operação fornecidos.
     */
    public double calcularOperacao(int a, int b) {
        return _operacao.calculo(a, b);
    }
    
    /**
     * Classe responsável pela operação "soma".
     */
    public static class Soma implements Operacao {
        
        /**
         * Soma
         * @param a
         * @param b
         * @return Soma dos parâmetros
         */
        @Override
        public int calculo(int a, int b) {
            return a+b;
        }      
    }
    
    /**
     * Classe responsável pela operação "subtração".
     */
    public static class Subtracao implements Operacao {
        
        /**
         * Subtração
         * @param a
         * @param b
         * @return Subtração dos parâmetros
         */
        @Override
        public int calculo(int a, int b) {
            return a-b;
        }     
    }
    
    /**
     * Classe responsável pela operação "multiplicação".
     */
    public static class Multiplicacao implements Operacao {
        
        /**
         * Multiplicação
         * @param a
         * @param b
         * @return Multiplicação dos parâmetros
         */
        @Override
        public int calculo(int a, int b) {
            return a*b;
        }
    }
    
    /**
     * Classe responsável pela operação "divisão".
     */
    public static class Divisao implements Operacao {

        /**
         * Divisão
         * @param a
         * @param b
         * @return Divisão dos parâmetros
         */
        @Override
        public int calculo(int a, int b) {
            return a/b;
        }
    }
}
