import java.io.*;
import java.util.*;

public class BancoDePalavras {
    private List<String> palavras;

    public BancoDePalavras(String caminhoArquivo) {
        palavras = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            while (scanner.hasNextLine()) {
                palavras.add(scanner.nextLine().trim());
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo de palavras", e);
        }
    }

    public String getPalavraAleatoria() {
        Random rand = new Random();
        return palavras.get(rand.nextInt(palavras.size()));
    }
}