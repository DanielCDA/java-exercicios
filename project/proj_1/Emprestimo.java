public class Emprestimo {
    private final int id = 1;
    private Usuario usuario;
    private  ItemAcervo item;
    private String dataEmprestimo;
    private String dataDevolucao;
    private boolean devolvido = false;
    
    public Emprestimo(Usuario usuario, ItemAcervo item)
    {
        this.usuario = usuario;
        this.item = item;
        this.id += 1;
        this.dataEmprestimo = hoje();
        item.emprestar();
    }

    public Emprestimo(Usuario u, ItemAcervo i, String obs) { }

    public boolean isAtrasado(String dataAtual){
        return dataAtual > dataDevolucao;
    }

    @Override
    public String toString(){
        return "Id: " + id + " Usuario: " + usuario + "item: " + item + "";
     } 
     private String hoje() {
        return "2026-06-03"; 
    } 
}
