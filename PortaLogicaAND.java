/**
 * Representa uma porta lógica com duas entradas que realiza a operação lógica AND.
 */
public class PortaLogicaAND {
    private boolean entrada1;
    private boolean entrada2;

    /**
     * Construtor da classe.
     *
     * @param entrada1 O valor da primeira entrada (true, false, 0 ou 1).
     * @param entrada2 O valor da segunda entrada (true, false, 0 ou 1).
     * @throws IllegalArgumentException Se os valores das entradas não forem booleanos ou não puderem ser convertidos para booleanos.
     */
    public PortaLogicaAND(boolean entrada1, boolean entrada2) {
        this.entrada1 = converteParaBooleano(entrada1);
        this.entrada2 = converteParaBooleano(entrada2);
    }

    /**
     * Método para converter um valor para booleano, considerando 0 como false e 1 como true.
     *
     * @param valor O valor a ser convertido para booleano.
     * @return true se o valor for 1 ou true, false se o valor for 0 ou false.
     * @throws IllegalArgumentException Se o valor não puder ser convertido para booleano.
     */
    private boolean converteParaBooleano(Object valor) {
        if (valor instanceof Boolean) {
            return (boolean) valor;
        } else if (valor instanceof Integer) {
            int valorInt = (int) valor;
            if (valorInt == 0) {
                return false;
            } else if (valorInt == 1) {
                return true;
            } else {
                throw new IllegalArgumentException("O valor inteiro deve ser 0 ou 1");
            }
        } else {
            throw new IllegalArgumentException("O valor deve ser booleano (true/false) ou inteiro (0/1)");
        }
    }

    /**
     * Obtém o valor da primeira entrada.
     *
     * @return O valor da primeira entrada.
     */
    public boolean getEntrada1() {
        return entrada1;
    }

    /**
     * Obtém o valor da segunda entrada.
     *
     * @return O valor da segunda entrada.
     */
    public boolean getEntrada2() {
        return entrada2;
    }

    /**
     * Calcula e retorna o valor da saída da porta lógica AND.
     *
     * @return O valor da saída da porta lógica AND.
     */
    public boolean getSaida() {
        // A saída será verdadeira (true) apenas se ambas as entradas forem verdadeiras (true)
        return entrada1 && entrada2;
    }
}

