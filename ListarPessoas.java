public class ListarPessoas {
    public static void listar() {
        if (CadastroPessoas.getListaPessoas().isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa pessoa : CadastroPessoas.getListaPessoas()) {
                System.out.println(pessoa);
            }
        }
    }
}