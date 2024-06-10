import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //Menu para o programa
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Alterar Pessoa");
            System.out.println("4. Excluir Pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha
            //Switch para o usuario selecionar a opção que deseja acessar
            switch (opcao) {
                case 1:
                    AdicionarPessoa.adicionar();
                    break;
                case 2:
                    ListarPessoas.listar();
                    break;
                case 3:
                    AlterarPessoa.alterar();
                    break;
                case 4:
                    ExcluirPessoa.excluir();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}acessar
AdicionarPessoa
acessar
System
