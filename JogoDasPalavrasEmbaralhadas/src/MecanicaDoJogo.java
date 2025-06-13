public interface MecanicaDoJogo {
    boolean jogoAcabou();
    String getProximaPalavra();
    void processarTentativa(String tentativa);
    int getPontuacao();
}