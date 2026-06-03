package animal;

public class Cachorro extends Anima {
    public void testarAcesso() {
        // PODE acessar (mesmo pacote)
        this.nome = "Rex";        // default funciona
        this.idade = 3;           // protected funciona
        this.especie = "Canina";  // public funciona
        this.respirar();          // protected funciona
        
        // NÃO pode acessar private
        // this.dna = "ATCG";      // ERRO! private
        // this.metabolismo();     // ERRO! private
    }
}