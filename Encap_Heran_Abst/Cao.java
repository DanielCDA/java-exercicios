

public class Cao extends Animal {
    private String raca;

    public Cao(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }

        @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raca: " + raca);
    }

    public void dormir() {
        System.out.println(getNome() + " esta dormindo...");
    }


    public static void main(String[] args) {
        Cao cao1 = new Cao("Rex", 5, "Labrador");
        Cao cao2 = new Cao("Bella", 3, "Poodle");

        System.out.println("Cao 1:");
        cao1.exibirInfo();
        cao1.fazerSom();

        System.out.println();

        System.out.println("Cao 2:");
        cao2.exibirInfo();
        cao2.fazerSom();
    }
}
