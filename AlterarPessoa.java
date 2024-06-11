import java.util.Scanner;

public class AlterarPessoa {
    public static void alterar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da pessoa a ser alterada: ");
        String nome = scanner.nextLine();

        for (Pessoa pessoa : CadastroPessoas.getListaPessoas()) {
            if (pessoa.getNome().equals(nome)) {
                System.out.print("Novo Nome: ");
                String novoNome = scanner.nextLine();
                System.out.print("Nova Idade: ");
                int novaIdade = scanner.nextInt();
                scanner.nextLine();  // Consumir a quebra de linha
                System.out.print("Novo Email: ");
                String novoEmail = scanner.nextLine();
                System.out.print("Novo Sexo: ");
                String novoSexo = scanner.nextLine();

                pessoa.setNome(novoNome);
                pessoa.setIdade(novaIdade);
                pessoa.setEmail(novoEmail);
                pessoa.setSexo(novoSexo);
                System.out.println("Dados da pessoa alterados com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}