
public class TryCatchBasic {
    public static void main(String [] args)
    {
        //NULLPOINTEREXCEPTION é quando você tenta acessar um método ou atributo de um objeto que é null. 
        try {
            String nome =null;
            System.out.println(nome.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Ocorreu um erro de ponteiro nulo: " + e.getMessage());
        }

        System.out.println("");

        //ARITHMETICEXCEPTION é quando você tenta realizar uma operação matemática ilegal, como dividir por zero.
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Ocorreu um erro aritmético: " + e.getMessage());
        }
    }
    
}
