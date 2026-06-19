

import java.util.*;


public class Car {
    public static void main(String[] args) {
        LinkedList<String> carros = new LinkedList<>();
        carros.add("Merceds");
        carros.add("Toyota");
        carros.add("LExus");
        carros.add("BMw");
        carros.add("Ford");

        System.out.println("== Novos Streams ==");

        //usando o forEach
        carros.stream().forEach(carro -> System.out.println(carro));

        //usando o forEach + filter
        System.out.println("\n == Usando filtro ==");
        carros.stream()
        .filter(carro -> carro.startsWith("M"))
        .forEach(carro -> System.out.println("\n " + carro));

        //usando o forEach + filter + map
        System.out.println("\n == Usando Map ==");
        carros.stream()
        .map(String::toUpperCase)
        .forEach(carro -> System.err.println(" " + carro));

    }
    
}
