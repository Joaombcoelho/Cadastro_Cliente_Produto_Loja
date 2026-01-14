import java.util.Scanner;


public class cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        String email = scanner.next();

        Cliente cliente = new Cliente(nome, email);

        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso! Email: " + cliente.getEmail());

        scanner.close();
    }

static class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
}