

public class Encapsulamento {
    // Consiste em privatizar os atributos de uma classe e fornecer 
    // métodos públicos para acessar e modificar esses atributos.
    private String nome;
    private int idade;

    public Encapsulamento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public static void main(String[] args) {
        Encapsulamento pessoa1 = new Encapsulamento("Alice", 30);
        Encapsulamento pessoa2 = new Encapsulamento("Bob", 25);

        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        System.out.println();

        System.out.println("Pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
    }
    
}
