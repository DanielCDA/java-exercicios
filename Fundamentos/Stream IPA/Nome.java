import java.util.*;
import java.util.stream.Collectors;

public class Nome {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        
        nomes.add("DElgado");
        nomes.add("Daniel");
        nomes.add("Bruno");
        nomes.add("ana");
        nomes.add("Bruno");
        
        System.out.println("=== CONCEITO DE STREAM EM JAVA ===\n");
        
        // 1. forEach - Iterar sobre cada elemento
        System.out.println("1. forEach - Percorrer cada nome:");
        nomes.stream().forEach(nome -> System.out.println("   " + nome));
        
        System.out.println("\n2. filter - Filtrar nomes que começam com 'D':");
        nomes.stream()
             .filter(nome -> nome.startsWith("D"))
             .forEach(nome -> System.out.println("   " + nome));
        
        // 3. map - Transformar os elementos
        System.out.println("\n3. map - Converter para MAIÚSCULAS:");
        nomes.stream()
             .map(String::toUpperCase)
             .forEach(nome -> System.out.println("   " + nome));
        
        // 4. filter + map - Combinação de operações
        System.out.println("\n4. filter + map - Nomes com mais de 4 caracteres em maiúsculas:");
        nomes.stream()
             .filter(nome -> nome.length() > 4)
             .map(String::toUpperCase)
             .forEach(nome -> System.out.println("   " + nome));
        
        // 5. distinct - Remover duplicatas
        System.out.println("\n5. distinct - Nomes únicos:");
        nomes.stream()
             .distinct()
             .forEach(nome -> System.out.println("   " + nome));
        
        // 6. sorted - Ordenar
        System.out.println("\n6. sorted - Nomes em ordem alfabética:");
        nomes.stream()
             .sorted()
             .forEach(nome -> System.out.println("   " + nome));
        
        // 7. limit - Limitar quantidade
        System.out.println("\n7. limit - Apenas os 2 primeiros nomes:");
        nomes.stream()
             .limit(2)
             .forEach(nome -> System.out.println("   " + nome));
        
        // 8. count - Contar elementos
        System.out.println("\n8. count - Total de nomes:");
        long total = nomes.stream().count();
        System.out.println("   Total: " + total);
        
        // 9. collect - Coletar em uma lista
        System.out.println("\n9. collect - Nomes em MAIÚSCULAS coletados em lista:");
        List<String> nomesEmMaiusculas = nomes.stream()
                                              .map(String::toUpperCase)
                                              .collect(Collectors.toList());
        System.out.println("   " + nomesEmMaiusculas);
        
        // 10. anyMatch - Verificar se algum atende a condição
        System.out.println("\n10. anyMatch - Existe nome que começa com 'B'?");
        boolean temB = nomes.stream()
                            .anyMatch(nome -> nome.startsWith("B"));
        System.out.println("   " + (temB ? "SIM" : "NÃO"));
        
        // 11. allMatch - Verificar se todos atendem a condição
        System.out.println("\n11. allMatch - Todos têm mais de 2 caracteres?");
        boolean todosGrandes = nomes.stream()
                                    .allMatch(nome -> nome.length() > 2);
        System.out.println("   " + (todosGrandes ? "SIM" : "NÃO"));
        
        // 12. findFirst - Encontrar o primeiro
        System.out.println("\n12. findFirst - Primeiro nome que começa com 'D':");
        String primeiro = nomes.stream()
                              .filter(nome -> nome.startsWith("D"))
                              .findFirst()
                              .orElse("Não encontrado");
        System.out.println("   " + primeiro);
    }
}
