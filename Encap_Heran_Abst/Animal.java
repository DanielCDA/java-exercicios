

public abstract class Animal {
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
    
    public abstract void dormir();
    
    public void fazerSom() {
        System.out.println(nome + " faz algum som...");
    }
    
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos");
    }
    
}
