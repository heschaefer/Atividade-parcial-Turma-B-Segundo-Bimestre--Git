public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String sexo;  // Novo atributo

    public Pessoa(String nome, int idade, String email, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + ", sexo=" + sexo + "]";
    }
}