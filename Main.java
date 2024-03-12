public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe PortaLogicaAND
        PortaLogicaAND porta = new PortaLogicaAND(true, false);

        // Imprimindo os valores de entrada e saída para a primeira porta
        System.out.println("Porta AND com duas entradas:");
        System.out.println("entrada1:"+porta.getEntrada1()+", entrada2:"+porta.getEntrada2());
        System.out.println("Saída: " + porta.getSaida());

        // Criando um objeto da classe PortaLogicaANDComTresEntradas
        PortaLogicaANDComTresEntradas portaTresEntradas = new PortaLogicaANDComTresEntradas();

        // Definindo os valores das três entradas
        boolean entrada1 = true;
        boolean entrada2 = false;
        boolean entrada3 = true;

        // Obtendo e imprimindo o valor da saída com três entradas
        boolean saida = portaTresEntradas.getSaida(entrada1, entrada2, entrada3);
        System.out.println("\nPorta AND com três entradas:");
        System.out.println("Entrada 1: " + entrada1 + ", Entrada 2: " + entrada2 + ", Entrada 3: " + entrada3);
        System.out.println("Saída: " + saida);
    }
}
