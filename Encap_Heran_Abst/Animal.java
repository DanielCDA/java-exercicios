

public class Animal {
    // Consiste em privatizar os atributos de uma classe e fornecer 
    // métodos públicos para acessar e modificar esses atributos.
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
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

    // Métodos
    public void comer() {
        System.out.println(nome + " está comendo...");
    }
    
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }
    
    public void fazerSom() {
        System.out.println(nome + " faz algum som...");
    }
    
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Alice", 30);
        Animal animal2 = new Animal("Bob", 25);

        System.out.println("Animal 1:");
        System.out.println("Nome: " + animal1.getNome());
        System.out.println("Idade: " + animal1.getIdade());

        System.out.println();

        System.out.println("Animal 2:");
        System.out.println("Nome: " + animal2.getNome());
        System.out.println("Idade: " + animal2.getIdade());
    }
    
}
