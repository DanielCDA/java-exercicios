import java.util.*;

//FilaAtendimento
public class ExemploQueue {
     private Queue<String> fila = new LinkedList<>();
    private int contadorSenha = 1;
    
    public void gerarSenha(String nome) {
        String senha = "S" + String.format("%03d", contadorSenha++);
        fila.offer(senha);
        System.out.println("Senha " + senha + " gerada para " + nome);
    }
    
    public String chamarProximo() {
        String senha = fila.poll();
        if (senha != null) {
            System.out.println("Chamando senha: " + senha);
            return senha;
        }
        System.out.println("Fila vazia!");
        return null;
    }
    
    public void exibirFila() {
        System.out.println("\n=== FILA DE ATENDIMENTO ===");
        System.out.println("Senhas aguardando: " + fila);
        System.out.println("Total: " + fila.size() + " pessoas");
    }
    
    // Simulação de caixa prioritário
    public void processarComPrioridade() {
        Queue<String> normal = new LinkedList<>();
        Queue<String> prioritario = new LinkedList<>();
        
        // Adicionando pessoas com prioridade
        prioritario.offer("Idoso - Joao");
        normal.offer("Adulto - Ana");
        prioritario.offer("Gestante - Maria");
        normal.offer("Adulto - Pedro");
        
        System.out.println("\n=== ATENDIMENTO COM PRIORIDADE ===");
        while (!prioritario.isEmpty() || !normal.isEmpty()) {
            // Atende prioritários primeiro
            if (!prioritario.isEmpty()) {
                System.out.println("Atendendo PRIORITARIO: " + prioritario.poll());
            } else {
                System.out.println("Atendendo NORMAL: " + normal.poll());
            }
        }
    }
    
    public static void main(String[] args) {
        ExemploQueue atendimento = new ExemploQueue();
        
        atendimento.gerarSenha("Ana");
        atendimento.gerarSenha("Joao");
        atendimento.gerarSenha("Maria");
        
        atendimento.exibirFila();
        
        atendimento.chamarProximo();
        atendimento.chamarProximo();
        
        atendimento.exibirFila();
        
        atendimento.processarComPrioridade();
    }
}
