public class Usuario {
    private static int contadorId = 1;  // contador global
    private final int id; 
    private String nome;
    private String Email;

    public Usuario(String nome, String Email) {
        this.nome = nome;
        this.Email = Email;
        this.id = contadorId++;  // atribui o ID atual e incrementa para o próximo
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return Email;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Email: " + Email;
    }
}
