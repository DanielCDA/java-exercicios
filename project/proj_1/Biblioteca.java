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
        this.usuarios[totalUsuarios] = u;
    } 
    public void realizarEmprestimo(int usuarioId, String codigoItem){
    }
    public void realizarDevolucao(int emprestimoId){} 
    public void listarDisponiveis(){}
}
