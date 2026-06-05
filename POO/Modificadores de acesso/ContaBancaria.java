public class ContaBancaria {
    // Atributos private - só esta classe pode acessar
    private double saldo;
    private String numeroConta;
    private String senha;
    
    // Construtor public (acessível a todos)
    public ContaBancaria(String numeroConta, String senha) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = 0.0;
    }
    
    // Métodos public - controlam acesso aos atributos private
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de Kz" + valor + " realizado");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de Kz" + valor + " realizado");
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }
    
    public double getSaldo() {
        return this.saldo;  // getter public permite leitura
    }
    
    // Método private - só pode ser chamado dentro desta classe
    private void registrarLog(String operacao) {
        System.out.println("LOG: " + operacao + " na conta " + numeroConta);
    }
    
    private boolean validarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", "senha123");
        
        // ✅ Pode chamar métodos public
        conta.depositar(1000);
        conta.sacar(500);
        System.out.println("Saldo: " + conta.getSaldo());
        
        // ERRO DE COMPILAÇÃO - não pode acessar diretamente
        // conta.saldo = 999999;        // saldo é private
        // conta.numeroConta = "99999"; // numeroConta é private
        // conta.registrarLog("teste");  // método private
        
        // Também não pode acessar de outra classe
        // System.out.println(conta.senha);
    }
}