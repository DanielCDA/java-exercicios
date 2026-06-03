// Classe que implementa a interface
public class Carro implements Veiculo {
    @Override
    public void iniciar() {
        System.out.println("Ligando o motor do carro...");
    }

    @Override
    public void parar() {
        System.out.println("Parando o motor do carro...");
    }
}