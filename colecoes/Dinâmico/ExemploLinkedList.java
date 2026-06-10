import java.util.LinkedList;


public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Adicionando elementos à LinkedList
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Imprimindo a LinkedList
        System.out.println("LinkedList: " + lista);

        System.out.println();

        // Acessando um elemento específico
        String elemento = lista.get(1);
        System.out.println("Elemento na posicao 1: " + elemento);

        System.out.println();

        // Removendo um elemento
        lista.remove(0);
        System.out.println("LinkedList apos remocao: " + lista);

        System.out.println();

        // Verificando se a LinkedList contém um elemento
        boolean contem = lista.contains("Elemento 2");
        System.out.println("A LinkedList contem 'Elemento 2'? " + contem);
    }
    
}
