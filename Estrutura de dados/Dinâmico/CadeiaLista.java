import java.util.ArrayList;

public class CadeiaLista {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("banana");
        frutas.add("morango");
        frutas.add("abacate");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("A fruta guardada : " + frutas.get(i));
        }

        System.out.println();
        frutas.remove("morango");
        System.out.println("Frutas apos remover morango: " + frutas);


        // Manipulacao de ArrayList<> com os seus metodos
        frutas.add("laranja");
        frutas.add(0, "uva");
        System.out.println("Frutas apos adicionar laranja e a uva em uma posicao exata: " + frutas);
        System.out.println();

        System.out.println("Fruta na posicao 3: " + frutas.get(3)); // acessa o elemento na posicao 3
        System.out.println("Tamanho da lista de frutas: " + frutas.size()); // retorna o tamanho da lista
        System.out.println("A lista de frutas esta vazia? " + frutas.isEmpty());
        System.out.println("A lista de frutas contem 'banana'? " + frutas.contains("banana"));
        System.out.println();
        System.out.println(frutas.set(2, "melancia")); // substitui o elemento na posicao 2 por "melancia"
        System.out.println("Frutas apos substituir o elemento na posicao 2 por melancia: " + frutas); 
        frutas.add("abacaxi");
        frutas.add("manga");
        frutas.add("kiwi");
        System.out.println();
        System.out.println("Frutas apos substituir o elemento na posicao 2 por melancia: " + frutas); 

        frutas.remove(4); // remove o elemento na posicao 4
        frutas.remove("banana"); // remove o elemento "abacaxi" da lista
        System.out.println("Frutas apos remover o elemento na posicao 4, e o elemento 'abacaxi': " + frutas);
        frutas.sort(null); // ordena a lista de frutas em ordem alfabetica
        frutas.stream().filter(fruta -> fruta.startsWith("m")).forEach(System.out::println); // filtra as frutas que começam com a letra "m" e imprime cada uma delas
        System.out.println();
        frutas.forEach(System.out::println);







    }
}
