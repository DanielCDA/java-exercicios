

public class Main {
    public static void main(String[] args) {
        // Usuario usuario = new Usuario("Alice", "alice@example.com");
        // System.out.println(usuario);
        // Livro livro = new Livro("123456789", "Java Programming", "John Doe");
        // System.out.println(livro);
        // ItemAcervo item = new ItemAcervo("001", "Java Programming");
        // System.out.println(item);

        DVD dvd = new DVD("002", "Java Programming DVD", "120 min");
        System.out.println(dvd.getPrazoDias() + " dias para empréstimo do DVD.");

        Revista revista = new Revista("003", "Java Magazine", "Tech Publishers");
        System.out.println(revista.getPrazoDias() + " dias para empréstimo da Revista.");
    }
}
