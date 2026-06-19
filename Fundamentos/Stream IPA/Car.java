

import java.util.*;


public class Car {
    public static void main(String[] args) {
        LinkedList<String> carros = new LinkedList<>();
        carros.add("Merceds");
        carros.add("Toyota");
        carros.add("LExus");
        carros.add("BMw");
        carros.add("Fors");

        System.out.println("== Novos Streams ==");

        //usando o forEach
        carros.stream().forEach(carro -> System.out.println(carro));

    }
    
}
