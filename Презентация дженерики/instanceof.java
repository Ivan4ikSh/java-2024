// пример использования instanceof с параметризированными классами
class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public void main() {
    Wrapper<Integer> wrapper = new Wrapper<>(123);

    if (wrapper instanceof Wrapper<?>) {
        System.out.println("это обьект параметризированного класса Wrapper");
    }
}