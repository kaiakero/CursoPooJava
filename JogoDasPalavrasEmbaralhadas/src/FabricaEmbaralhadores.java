import java.util.*;

public class FabricaEmbaralhadores {
    private static final List<Embaralhador> embaralhadores = Arrays.asList(
        new InversorEmbaralhador(), new AleatorioEmbaralhador()
    );

    public static Embaralhador getEmbaralhadorAleatorio() {
        Random rand = new Random();
        return embaralhadores.get(rand.nextInt(embaralhadores.size()));
    }
}