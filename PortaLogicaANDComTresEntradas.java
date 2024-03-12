/**
 * Representa uma porta lógica com três entradas que realiza a operação lógica AND.
 * @author Joel António
 * @version 1.0
 */
public class PortaLogicaANDComTresEntradas {
    /**
     * Obtém o valor da saída com três entradas.
     *
     * @param entrada1 O valor da primeira entrada.
     * @param entrada2 O valor da segunda entrada.
     * @param entrada3 O valor da terceira entrada.
     * @return O valor da saída da operação lógica AND.
     */
    public boolean getSaida(boolean entrada1, boolean entrada2, boolean entrada3) {
        // Criando duas instâncias da classe PortaLogicaAND com duas entradas
        PortaLogicaAND porta1 = new PortaLogicaAND(entrada1, entrada2);
        PortaLogicaAND porta2 = new PortaLogicaAND(porta1.getSaida(), entrada3);

        // Retornando o valor da saída da segunda porta
        return porta2.getSaida();
    }
}

