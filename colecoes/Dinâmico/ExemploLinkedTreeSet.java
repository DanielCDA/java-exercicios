import java.util.*;
public class ExemploLinkedTreeSet{
    public static void main(String[] args) {
        // Criando LinkedHashSet
        Set<String> nomes = new LinkedHashSet<>();
        
        // Adicionando elementos (duplicatas são ignoradas)
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Ana");  // Ignorado! Já existe
        
        
        System.out.println("Nomes: " + nomes);
        // Saída: [Ana, João, Maria, Pedro] (ordem de inserção!)
        
        // Verificando existência (muito rápido!)
        boolean temAna = nomes.contains("Ana");      // true
        boolean temCarlos = nomes.contains("Carlos"); // false
        
        // Removendo
        nomes.remove("João");
        
        // Percorrendo (ordem de inserção é mantida)
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
        
        //Exemplo de TreeSet
        Set<String> nomesOrdenados = new TreeSet<>(nomes);
        nomesOrdenados.add("Beto");

        System.out.println("Nomes ordenados: " + nomesOrdenados);
        // Saída: [Ana, Beto, Maria, Pedro] (ordem alfabetica!)

    }
}