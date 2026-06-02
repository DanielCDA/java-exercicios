public class Retangulo {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura)
    {
        this.largura = largura;
        this.altura = altura;   
    }

    public int calcularArea()
    {
        return (int) (largura * altura);
    }

    public int calcularPerimetro()
    {
        return (int) (2 * (largura + altura));
    }


    public static void  main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5.0, 3.0);
        Retangulo retangulo2 = new Retangulo(4.0, 6.0);

        System.out.println("Retângulo 1:");
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());

        System.out.println();

        System.out.println("Retângulo 2:");
        System.out.println("Área: " + retangulo2.calcularArea());
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());
    }
}
