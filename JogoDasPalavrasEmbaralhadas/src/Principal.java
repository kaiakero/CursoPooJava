import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.criarMecanica();

        while (!mecanica.jogoAcabou()) {
            String palavra = mecanica.getProximaPalavra();
            System.out.println("Adivinhe a palavra: " + palavra);
            String tentativa = scanner.nextLine();
            mecanica.processarTentativa(tentativa);
        }

        System.out.println("Jogo encerrado! Pontuação final: " + mecanica.getPontuacao());
    }
}