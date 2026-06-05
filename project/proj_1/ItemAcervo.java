public class ItemAcervo {
    private final String codigo;
    private String titulo;
    private boolean disponivel = true;

    public ItemAcervo(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public String toString()
    {
        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Disponivel: " + disponivel;
    }
}
