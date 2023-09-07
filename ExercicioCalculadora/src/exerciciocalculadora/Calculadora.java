package exerciciocalculadora;

public class Calculadora {
    
    private Operacao _operacao;
    
    public Calculadora(Operacao operacao) {
        this._operacao = operacao;
    }
    
    public int calcularOperacao(int a, int b) {
        return _operacao.calculo(a, b);
    }
    
    
    //--------- Classes das Operações ----------
    
    public static class Soma implements Operacao {
        
        @Override
        public int calculo(int a, int b) {
            return a+b;
        }      
    }
    
    public static class Subtracao implements Operacao {
        
        @Override
        public int calculo(int a, int b) {
            return a-b;
        }     
    }
    
    public static class Multiplicacao implements Operacao {
        
        @Override
        public int calculo(int a, int b) {
            return a*b;
        }
    }
    
    public static class Divisao implements Operacao {

        @Override
        public int calculo(int a, int b) {
            return a/b;
        }
    }
}
