import java.util.*;
public class ExemploMap {
    public static void main (String[] args) {
        // Criando um HashMap
        Map<String, Integer> idades = new HashMap<>();
        
        // Adicionando elementos
        idades.put("Charlie", 35);
        idades.put("Alice", 30);
        idades.put("Bob", 25);
        
        
        // Imprimindo o HashMap
        System.out.println("Idades(a ordem de saida he pelo value): " + idades);
        
        // Acessando um valor específico
        int idadeAlice = idades.get("Alice");
        System.out.println("Idade de Alice: " + idadeAlice);
        
        // Verificando existência de uma chave
        boolean temBob = idades.containsKey("Bob");
        System.out.println("Tem Bob? " + temBob);
        
        // Removendo um elemento
        idades.remove("Charlie");
        System.out.println("Idades apos remocao: " + idades);
        
        // Iterando sobre as chaves e valores
        for (Map.Entry<String, Integer> entry : idades.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }

        System.out.println("------------------------------------------------------------------------");

        // Exemplo de linkedHashMap (mantém a ordem de inserção)
        Map<String, Integer> idadesOrdenadas = new LinkedHashMap<>();
        idadesOrdenadas.put("Bob", 25);
        idadesOrdenadas.put("Charlie", 35);
        idadesOrdenadas.put("Alice", 30);
        
        
        System.out.println("idades pela ordem de insercao: " + idadesOrdenadas);
        idadesOrdenadas.remove("Charlie");
        System.out.println("Idades ordenadas apos remocao: " + idadesOrdenadas);


        System.out.println("------------------------------------------------------------------------");
        // Exemplo de TreeMap (ordena as chaves)
        Map<String, Integer> idadesTree = new TreeMap<>(idades);
        System.out.println("Idades em arvore(ordenadas por chave que e do tipo String): " + idadesTree);
    }
}
