public class Usuario {
    private static int id = 1;
    private String nome;
    private String Email;

    public Usuario(String nome, String Email) {
        this.nome = nome;
        this.Email = Email;
        this.id++;  
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
