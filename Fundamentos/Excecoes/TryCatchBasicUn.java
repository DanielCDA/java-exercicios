

public class TryCatchBasicUn {
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
            System.out.println("Ocorreu um erro aritmetico: " + e.getMessage());
        }
        System.out.println("");

        //ARRAYINDEXOUTOFBOUNDSEXCEPTION é quando você tenta acessar um índice de um array que está fora dos limites válidos.
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ocorreu um erro de indice de array: " + e.getMessage());
        }
        System.out.println("");
        //NumberFormatException é quando você tenta converter uma string em um número, mas a string não tem um formato numérico válido.
        try {
            String numeroStr = "abc";
            int numero = Integer.parseInt(numeroStr);
            System.out.println(numero);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Ocorreu um erro de formato de numero: " + e.getMessage());
        }

        System.out.println("");
        
    }
}
