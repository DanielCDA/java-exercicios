public class Livro extends ItemAcervo {
    private static final int Max_Livros = 4;
    private String isbn;
    private String autor;

    public Livro(String isbn, String titulo, String autor) {
        super(isbn, titulo);
        this.autor = autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public int getPrazoDias() {
        return 14;
    }

    public String toString(){
        return "ISBN:" + isbn + ", Autor: " + autor;
    }



    
}
