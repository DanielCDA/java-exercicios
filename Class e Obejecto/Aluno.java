public class Aluno{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public static void main (String[] args) {
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);


        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());

        System.out.println("Nome:" + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());  
    }
}