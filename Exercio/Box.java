
import java.util.Optional;

public class Box <T> {
    private T item;

    // Construtor que aceita Optional (mais flexível)
    public Box() {
        this.item = null;
    }

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    // Método put que aceita Optional (Java 9+)
    public void put(Optional<T> optionalItem) {
        this.item = optionalItem.orElse(null);
    }

    public Optional<T> getOptionalItem() {
        return Optional.ofNullable(item);
    }

     public void clear() {
        this.item = null;
    }
}
