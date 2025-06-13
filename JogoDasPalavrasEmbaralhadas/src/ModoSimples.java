public class ModoSimples implements MecanicaDoJogo {
    private int pontuacao = 0;
    private int tentativas = 0;
    private static final int TOTAL_PALAVRAS = 5;
    private BancoDePalavras banco = new BancoDePalavras("palavras.txt");
    private Embaralhador embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
    private String palavraAtualOriginal;

    public boolean jogoAcabou() {
        return tentativas >= TOTAL_PALAVRAS;
    }

    public String getProximaPalavra() {
        palavraAtualOriginal = banco.getPalavraAleatoria();
        tentativas++;
        return embaralhador.embaralhar(palavraAtualOriginal);
    }

    public void processarTentativa(String tentativa) {
        if (tentativa.equalsIgnoreCase(palavraAtualOriginal)) {
            pontuacao += 10 * embaralhador.getDificuldade();
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou! A palavra era: " + palavraAtualOriginal);
        }
    }

    public int getPontuacao() {
        return pontuacao;
    }
}