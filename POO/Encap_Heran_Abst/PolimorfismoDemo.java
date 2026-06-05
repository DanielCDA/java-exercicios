

public class PolimorfismoDemo {
     public static void main(String[] args) {
        // 1. Polimorfismo de referência
        Animal animal1 = new Cao("Rex", 3, "Labrador");
        Animal animal2 = new Gato("Mimi", 2, "Branco");
        
        
        // Mesmo método, comportamentos diferentes
        animal1.fazerSom();  // Rex late: Au Au!
        animal2.fazerSom();  // Mimi mia: Miau!
        
        
        // 2. Polimorfismo de parâmetro (método aceita subtipos)
        fazerAnimalFalar(animal1);
        fazerAnimalFalar(animal2);
        
        
        // 3. Polimorfismo com array
        Animal[] animais = {animal1, animal2, };
        for (Animal a : animais) {
            a.fazerSom();
        }
    }
    
    public static void fazerAnimalFalar(Animal animal) {
        System.out.print("Animal diz: ");
        animal.fazerSom();
    }
}
