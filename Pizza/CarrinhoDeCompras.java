import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Pizza> pizzas = new ArrayList<>();

    // Método para adicionar uma pizza ao carrinho
    public void adicionaPizza(Pizza pizza) {
        if (pizza != null && pizza.getPreco() > 0) { // Verifica se a pizza tem ingredientes
            pizzas.add(pizza);
        } else {
            System.out.println("Pizza sem ingredientes não pode ser adicionada ao carrinho.");
        }
    }

    // Método para calcular o valor total de todas as pizzas no carrinho
    public int getTotal() {
        int total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}
