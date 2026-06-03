package veterinario;

import animal.Anima;

public class AnimalSelvagem extends Anima {
    public void testarAcesso() {
        // PODE acessar protected (é subclasse)
        this.idade = 5;           // protected funciona via herança
        this.respirar();          // protected funciona via herança
        this.especie = "Felina";  // public funciona
        
        // NÃO pode acessar default (pacote diferente e não é mesmo pacote)
        // this.nome = "Leão";     // ERRO! nome é default
        
        // Não pode acessar private
        // this.dna = "ATCG";      // ERRO! private
    }
}
