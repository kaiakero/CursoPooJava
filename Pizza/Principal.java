public class Principal {
    public static void main(String[] args) {
        // Criando as pizzas
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Mussarela");
        pizza1.adicionaIngrediente("Tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Frango");
        pizza2.adicionaIngrediente("Catupiry");
        pizza2.adicionaIngrediente("Milho");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Cebola");
        pizza3.adicionaIngrediente("Azeitona");
        pizza3.adicionaIngrediente("Ovo");
        pizza3.adicionaIngrediente("Queijo Extra");
        pizza3.adicionaIngrediente("Orégano");

        // Criando o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando as pizzas ao carrinho
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        // Imprimindo o total do carrinho
        System.out.println("Valor total do carrinho: R$ " + carrinho.getTotal());

        // Imprimindo a quantidade de cada ingrediente utilizado
        System.out.println("\nIngredientes utilizados:");
        for (Map.Entry<String, Integer> entry : Pizza.getIngredientesGastos().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
