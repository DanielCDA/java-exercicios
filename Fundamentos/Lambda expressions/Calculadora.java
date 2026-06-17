
@FunctionalInterface
public interface Calculadora {
    int calcular(int a, int b);
    public static void main(String[] args)
    {
        Calculadora soma = (a, b) -> a + b;
        Calculadora subtracao = (a, b) -> a - b;
        Calculadora dobro = (a, b) -> a * 2;

        System.out.println("Soma: " + soma.calcular(5, 3)); // Saída: Soma: 8
        System.out.println("Subtracao: " + subtracao.calcular(5, 3)); // Saída: Subtração: 2
        System.out.println("Dobro: " + dobro.calcular(5, 0));
    }
    
}
