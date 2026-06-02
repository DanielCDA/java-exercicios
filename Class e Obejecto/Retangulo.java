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

        System.out.println("Retangulo 1:");
        System.out.println("area: " + retangulo1.calcularArea());
        System.out.println("Perimetro: " + retangulo1.calcularPerimetro());

        System.out.println();

        System.out.println("Retangulo 2:");
        System.out.println("area: " + retangulo2.calcularArea());
        System.out.println("Perimetro: " + retangulo2.calcularPerimetro());
    }
}
