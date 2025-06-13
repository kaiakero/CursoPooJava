public class TesteAleatorioEmbaralhador {
    public static void main(String[] args) {
        Embaralhador embaralhador = new AleatorioEmbaralhador();
        String resultado = embaralhador.embaralhar("teste");
        assert resultado.length() == 5;
        assert !resultado.equals("teste");
        System.out.println("TesteAleatorioEmbaralhador passou.");
    }
}