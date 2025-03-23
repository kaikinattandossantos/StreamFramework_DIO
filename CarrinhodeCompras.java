import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {

    private List<Item> itemList;

    public CarrinhodeCompras() {
        this.itemList = new ArrayList<>();
    }

    public double calcularValorTotal() {
        if (itemList.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        return itemList.stream()
            .mapToDouble(item -> item.getPreco() * item.getQuantidade())
            .sum();
    }

    public void adicionarItem(Item item) {
        itemList.add(item);
        System.out.println("Item adicionado: " + item.getNome());
    }

    public static void main(String[] args) {
        CarrinhodeCompras carrinho = new CarrinhodeCompras();

        Item item1 = new Item("Camiseta", 29.99, 2);
        Item item2 = new Item("Calça", 59.99, 1);

        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        try {
            double valorTotal = carrinho.calcularValorTotal();
            System.out.println("Valor total do carrinho: R$ " + valorTotal);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Item {
    private String nome;
    private double preco;
    private double quantidade;

    public Item(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}