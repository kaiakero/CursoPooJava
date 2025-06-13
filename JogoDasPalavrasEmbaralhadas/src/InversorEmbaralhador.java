public class InversorEmbaralhador implements Embaralhador {
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

    public int getDificuldade() {
        return 1;
    }
}