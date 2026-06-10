public class Emprestimo {
    private static int contadorId = 1;
    private final int id;
    private Usuario usuario;
    private  ItemAcervo item;
    private String dataEmprestimo;
    private String dataDevolucao;
    private boolean devolvido = false;
    
    public Emprestimo(Usuario usuario, ItemAcervo item)
    {
        this.usuario = usuario;
        this.item = item;
        this.id = contadorId++;
        this.dataEmprestimo = hoje();
        item.emprestar();
    }

    public int getId() {
        return id;
    }

    
    public boolean isAtrasado(String dataAtual) {
        if (dataDevolucao == null) return false;
        return dataAtual.compareTo(dataDevolucao) > 0;
    }

    public void devolver() {
        if (devolvido) throw new IllegalStateException("Já foi devolvido");
        this.devolvido = true;
        this.dataDevolucao = hoje();
        item.devolver(); // libera o item no acervo
    }
    @Override
    public String toString(){
        return "Id: " + id + " Usuario: " + usuario + "item: " + item + "";
     } 
     private String hoje() {
        return "2026-06-03"; 
    } 
}
