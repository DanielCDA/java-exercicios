
public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

        @Override
    public void dormir() {
        System.out.println(getNome() + " esta dormindo...");
    }


    public static void main(String[] args) {
        Gato gato1 = new Gato("Whiskers", 2, "Preto");
        Gato gato2 = new Gato("Luna", 4, "Branco");

        System.out.println("Gato 1:");
        gato1.exibirInfo();
        System.out.println("Cor: " + gato1.getCor());
        gato1.fazerSom();
        gato1.dormir();

        System.out.println();

        System.out.println("Gato 2:");
        gato2.exibirInfo();
        System.out.println("Cor: " + gato2.getCor());
        gato2.fazerSom();
        gato2.dormir();
    }
    
}
