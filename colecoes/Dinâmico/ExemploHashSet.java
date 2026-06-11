public class ExemploHashSet {
    public static void main(String[] args) {
        // Criando HashSet
        Set<String> nomes = new HashSet<>();
        
        // Adicionando elementos (duplicatas são ignoradas)
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana");  // Ignorado! Já existe
        nomes.add("Pedro");
        
        System.out.println("Nomes: " + nomes);
        // Saída: [Ana, Maria, Pedro, João] (ordem aleatória!)
        
        // Verificando existência (muito rápido!)
        boolean temAna = nomes.contains("Ana");      // true
        boolean temCarlos = nomes.contains("Carlos"); // false
        
        // Removendo
        nomes.remove("João");
        
        // Percorrendo (ordem não é garantida)
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
        
        // Exemplo prático: remover duplicatas de uma lista
        List<String> listaComDuplicatas = Arrays.asList("A", "B", "A", "C", "B", "D");
        Set<String> semDuplicatas = new HashSet<>(listaComDuplicatas);
        System.out.println("Original: " + listaComDuplicatas);
        System.out.println("Sem duplicatas: " + semDuplicatas);
        
        // Operações com conjuntos
        Set<Integer> conjunto1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> conjunto2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        
        // União
        Set<Integer> uniao = new HashSet<>(conjunto1);
        uniao.addAll(conjunto2);
        System.out.println("União: " + uniao);
        
        // Interseção
        Set<Integer> intersecao = new HashSet<>(conjunto1);
        intersecao.retainAll(conjunto2);
        System.out.println("Interseção: " + intersecao);
        
        // Diferença
        Set<Integer> diferenca = new HashSet<>(conjunto1);
        diferenca.removeAll(conjunto2);
        System.out.println("Diferença (1 - 2): " + diferenca);
    }
}