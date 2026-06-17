
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

    public void put(T item) {
        this.item = item;
    }

    public Optional<T> getOptionalItem() {
        return Optional.ofNullable(item);
    }

     public void clear() {
        this.item = null;
    }
}
