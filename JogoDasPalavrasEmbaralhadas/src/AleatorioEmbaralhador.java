import java.util.*;

public class AleatorioEmbaralhador implements Embaralhador {
    public String embaralhar(String palavra) {
        List<Character> letras = new ArrayList<>();
        for (char c : palavra.toCharArray()) letras.add(c);
        Collections.shuffle(letras);
        StringBuilder embaralhada = new StringBuilder();
        for (char c : letras) embaralhada.append(c);
        return embaralhada.toString();
    }

    public int getDificuldade() {
        return 2;
    }
}