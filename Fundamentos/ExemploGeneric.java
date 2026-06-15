
public class ExemploGeneric<T> {
    private T valor;

    public ExemploGeneric(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        ExemploGeneric<Integer> exemploInt = new ExemploGeneric<>(42);
        System.out.println("Valor inteiro: " + exemploInt.getValor());

        ExemploGeneric<String> exemploString = new ExemploGeneric<>("Olá, Mundo!");
        System.out.println("Valor string: " + exemploString.getValor());
    }

    
}
