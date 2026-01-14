import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String nome = scanner.next();
        double preco = scanner.nextDouble();
        String categoria = scanner.next();

        Produto produto = new Produto(nome, preco, categoria);

        System.out.println("Produto: " + produto.getNome() + " | Categoria: " + produto.getCategoria() + " | Preco: R$ " + String.format(Locale.US, "%.2f", produto.getPreco()));

        scanner.close();
    }
}

class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
}