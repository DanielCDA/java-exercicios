public class Revista extends ItemAcervo {
    private String editora;
    private String edicao;
    private final int prazo = 7;

    public Revista(String codigo,String titulo, String editora) {
        super(codigo, titulo);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public int getPrazoDias() {
        return prazo;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "id='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", editora='" + editora + '\'' + 
                ", edicao='" + edicao + '\'' + 
                ", prazo=" + prazo +
                '}';
    }
    
}
