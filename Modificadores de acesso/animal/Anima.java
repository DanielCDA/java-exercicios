// Arquivo: animal/Animal.java
package animal;

public class Anima {
    // Atributos com diferentes visibilidades
    private String dna;           // apenas Animal
    String nome;                  // default (pacote animal)
    protected int idade;          // protected
    public String especie;        // public
    
    protected void respirar() {
        System.out.println(nome + " está respirando");
    }
    
    private void metabolismo() {
        System.out.println("Processos metabólicos...");
    }
}
