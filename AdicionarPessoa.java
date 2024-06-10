import java.util.Scanner;

public class AdicionarPessoa {
    public static void adicionar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, email, sexo);
        CadastroPessoas.getListaPessoas().add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }
}