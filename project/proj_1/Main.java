import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        // Dados de teste
        bib.adicionarItem(new Livro("978-1", "Clean Code", "Martin"));
        bib.adicionarItem(new DVD("DVD-1", "Interstellar", "169 min"));
        bib.adicionarItem(new Revista("REV-1", "Java Magazine", "Ed. 42"));
        bib.adicionarUsuario(new Usuario("Ana", "ana@email.com"));
        bib.adicionarUsuario(new Usuario("João", "joao@email.com"));

        while (true) {
            System.out.println("\n=== " + "Biblioteca Central" + " ===");
            System.out.println("1 - Listar disponiveis");
            System.out.println("2 - Realizar emprestimo");
            System.out.println("3 - Realizar devolucao");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();

            if (op == 0) break;

            if (op == 1) {
                bib.listarDisponiveis();
            } else if (op == 2) {
                System.out.print("ID do usuario: ");
                int userId = sc.nextInt();
                System.out.print("Codigo do item: ");
                String codigo = sc.next();
                bib.realizarEmprestimo(userId, codigo);
            } else if (op == 3) {
                System.out.print("ID do emprestimo: ");
                int empId = sc.nextInt();
                bib.realizarDevolucao(empId);
            }
        }
        sc.close();
    }
}