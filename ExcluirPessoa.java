import java.util.Scanner;

public class ExcluirPessoa {
    public static void excluir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da pessoa a ser excluída: ");
        String nome = scanner.nextLine();

        for (Pessoa pessoa : CadastroPessoas.getListaPessoas()) {
            if (pessoa.getNome().equals(nome)) {
                CadastroPessoas.getListaPessoas().remove(pessoa);
                System.out.println("Pessoa excluída com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}