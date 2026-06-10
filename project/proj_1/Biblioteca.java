public class Biblioteca {
     private static final int MAX_ITENS = 100; 
     private static final String NOME = "Biblioteca Central"; 
     private ItemAcervo[] acervo = new ItemAcervo[MAX_ITENS]; 
     private Usuario[] usuarios = new Usuario[MAX_ITENS]; 
     private Emprestimo[] emprestimos = new Emprestimo[MAX_ITENS]; 
     private int totalItens, totalUsuarios, totalEmprestimos;

    public void adicionarItem(ItemAcervo item) 
    {
        this.acervo[totalItens++] = item;
    }
    public void adicionarUsuario(Usuario u)
    {
        this.usuarios[totalUsuarios++] = u;
    } 
    public void realizarEmprestimo(int usuarioId, String codigoItem) 
    {
        // 1. Busca o usuário
        Usuario usuario = null;
        for (int i = 0; i < totalUsuarios; i++) {
        if (usuarios[i].getId() == usuarioId) {
               usuario = usuarios[i];
               break;
           }
       }
       if (usuario == null) {
           System.out.println("Usuario nao encontrado.");
           return;
           }

        // 2. Busca o item
        ItemAcervo item = null;
        for (int i = 0; i < totalItens; i++) {
            if (acervo[i].getCodigo().equals(codigoItem)) {
                    item = acervo[i];
                    break;
            }
        }
        if (item == null) {
            System.out.println("Item nao encontrado.");
            return;
        }

        // 3. Cria o empréstimo (já valida disponibilidade internamente)
        try {
            emprestimos[totalEmprestimos++] = new Emprestimo(usuario, item);
            System.out.println("Emprestimo realizado: " + item.getTitulo());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void realizarDevolucao(int emprestimoId) {
        for (int i = 0; i < totalEmprestimos; i++) {
            if (emprestimos[i].getId() == emprestimoId) {
                emprestimos[i].devolver();
                System.out.println("Devolucao registrada.");
                return;
            }
        }
        System.out.println("Emprestimo nao encontrado.");
    }

    public void listarDisponiveis() {
        System.out.println("=== Itens disponiveis ===");
        for (int i = 0; i < totalItens; i++) {
            if (acervo[i].isDisponivel()) {
                System.out.println(acervo[i]);
            }
        }
    }
}
