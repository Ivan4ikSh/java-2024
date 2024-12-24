// Пример наследования параметризированного класса
class Box<T> {
    private T value;
    public Box(T value) { this.value = value; }
    public T getValue() { return value; }
}

class ExtendedBox<T> extends Box<T> {
    public ExtendedBox(T value) { super(value); }
}

public class Main {
    public static void main(String[] args) {
        ExtendedBox<String> box1 = new ExtendedBox<>("Hello");
        ExtendedBox<Integer> box2 = new ExtendedBox<>(2024);
        System.out.println(box1.getValue() + " World!");
        System.out.println("Today is " + box2.getValue() + " year");
    }
}
