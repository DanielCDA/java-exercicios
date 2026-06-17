
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class ExemploFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<String> vasio = s -> s.isEmpty();
        Predicate<String> isLong = s -> s.length() > 8;

        System.out.println("A palavra esta he " + vasio.test("muito bom"));
        System.out.println(isLong.test("brite he bom estudar para entender que estas a fazer"));

        System.out.println("___________________________________");

        // Function — transforma String em Integer
        Function<String, Integer> tamanho = s -> s.length();
         // 4
        System.out.println(tamanho.apply("Java"));

        System.out.println("_________________________________________________________________");

        // Consumer — consome e age, sem devolver nada
        Consumer<String> imprimir = s -> System.out.println(s);
        imprimir.accept("Ola");

        System.out.println("_________________________________________________________________");

        // Supplier — fornece um valor quando chamado
        Supplier<String> mensagem = () -> "Gerado agora: " + Math.random();
        System.out.println(mensagem.get());


    }
    
}
