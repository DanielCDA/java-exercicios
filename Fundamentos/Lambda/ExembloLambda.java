import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExembloLambda {
    public static void main(String[] args) 
    {
       List<String> clientes = new ArrayList<>();
        clientes.add("Carlos");
        clientes.add("Ana");
        clientes.add("Bruno");
        clientes.add("Amanda");

        System.out.println("=== 1. JEITO ANTIGO (Classe Anonima) ===");
        // Queremos imprimir apenas os nomes que começam com a letra "A"
        // Para isso, o forEach precisa de uma interface chamada 'Consumer'
        clientes.forEach(new Consumer<String>() {
            @Override
            public void accept(String nome) {
                if (nome.startsWith("A")) {
                    System.out.println("Cliente: " + nome);
                }
            }
        });

        System.out.println("\n=== 2. JEITO MODERNO (Com Expressão Lambda) ===");
        // Fazemos exatamente a mesma filtragem e impressão em uma única linha limpa:
        clientes.forEach(nome -> {
            if (nome.startsWith("A")) {
                System.out.println("Cliente: " + nome);
            }
        });

        System.out.println("\n=== 3. BoNUS: Lambda ainda mais poderosa com Streams ===");
        // Usando a Stream API para filtrar e ordenar antes de exibir
        clientes.stream()
                .sorted()                             // Ordena em ordem alfabética (Ana, Amanda -> Amanda, Ana)
                .forEach(nome -> System.out.println("Cliente Filtrado e Ordenado: " + nome));
    }

}

    
     

