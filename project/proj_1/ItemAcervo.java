public abstract class ItemAcervo {
    private final String codigo;
    private String titulo;
    private boolean disponivel = true;

    public ItemAcervo(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    public void emprestar() {
        if (!disponivel) throw new IllegalStateException("Item indisponível");
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getPrazoDias()
    {
        return 0; // padrão, subclasses devem sobrescrever
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public String toString()
    {
        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Disponivel: " + disponivel;
    }
}
