import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private static final int PRECO_ATE_2_INGREDIENTES = 15;
    private static final int PRECO_ATE_5_INGREDIENTES = 20;
    private static final int PRECO_MAIS_5_INGREDIENTES = 23;

    private static Map<String, Integer> ingredientesGastos = new HashMap<>();
    private int quantidadeIngredientes = 0;

    // Método para adicionar um ingrediente à pizza
    public void adicionaIngrediente(String ingrediente) {
        if (ingrediente != null && !ingrediente.isBlank()) {
            quantidadeIngredientes++;
            contabilizaIngrediente(ingrediente);
        }
    }

    // Método para calcular o preço da pizza com base na quantidade de ingredientes
    public int getPreco() {
        if (quantidadeIngredientes <= 2) {
            return PRECO_ATE_2_INGREDIENTES;
        } else if (quantidadeIngredientes <= 5) {
            return PRECO_ATE_5_INGREDIENTES;
        } else {
            return PRECO_MAIS_5_INGREDIENTES;
        }
    }

    // Método estático para contabilizar os ingredientes
    private static void contabilizaIngrediente(String ingrediente) {
        ingredientesGastos.put(ingrediente, ingredientesGastos.getOrDefault(ingrediente, 0) + 1);
    }

    // Método estático para retornar os ingredientes contabilizados
    public static Map<String, Integer> getIngredientesGastos() {
        return ingredientesGastos;
    }
}
