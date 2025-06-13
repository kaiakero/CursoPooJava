public class TesteInversorEmbaralhador {
    public static void main(String[] args) {
        Embaralhador embaralhador = new InversorEmbaralhador();
        assert "odnum".equals(embaralhador.embaralhar("mundo"));
        System.out.println("TesteInversorEmbaralhador passou.");
    }
}