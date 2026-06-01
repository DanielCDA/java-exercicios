

public class Corda{
    public static void  main(String[] args) {
        String palavra = "Hello, World!";
        System.out.println(palavra);

        // Manipulacao de String Comparacao
        String a = "Hello";
        String b = "hello"; 

        
        // Manipulacao de String
        int tamanho = palavra.length();
        char letra = palavra.charAt(5);
        
        System.out.println("Tamanho da palavra: " + tamanho);
        System.out.println ("Letra na posicao 5: " + letra);
        System.out.println();
        System.out.println("palavra em minuscula:" + palavra.toUpperCase());
        System.out.println("palavra em maiuscula:" + palavra.toLowerCase());
        System.out.println();
        System.out.println("Comparacao de String a e b: " + a.equals(b));
        System.out.println("Comparacao de String ignorando maiusculas e minusculas: " + a.equalsIgnoreCase(b));
        System.out.println();
        //verifica se contém nq string
        System.out.println(" Sera que tem a palavra AZul? " + palavra.contains("Azul"));
        //indexOf(String) – posição da primeira ocorrência
        System.out.println(palavra.indexOf("Worde"));
        System.out.println();

        //replace(char velho, char novo) – substituir caracteres
        String novaPalavra = palavra.replace('o', 'x');
        System.out.println("Palavra com 'o' substituido por 'x': " + novaPalavra);
        System.out.println();

        //trim() – remove espaços das extremidades
        String palavraComEspacos = "  Hello, World!  ";
        System.out.println("Palavra com espaços: '" + palavraComEspacos + "'");
        System.out.println("Palavra sem espaços: '" + palavraComEspacos.trim() + "'");
    }
}