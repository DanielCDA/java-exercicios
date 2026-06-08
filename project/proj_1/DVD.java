
public class DVD extends ItemAcervo {
    private String duracao;
    private final int prazo = 3;
    
    public DVD(String codigo, String titulo, String duracao) {
        super(codigo, titulo);
        this.duracao = duracao;
    }
    public int getPrazoDias() {
        return prazo;
    }
}
