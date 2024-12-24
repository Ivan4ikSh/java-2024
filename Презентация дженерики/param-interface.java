// Пример реализации параметризированного интерфейса
interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }

    public V getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new OrderedPair<>(1, "Uno");
        Pair<String, String> pair2 = new OrderedPair<>("Two", "Dos");
        Pair<Character, String> pair3 = new OrderedPair<>('3', "Tres");

        System.out.println("Pair 1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair 2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
        System.out.println("Pair 3: Key = " + pair3.getKey() + ", Value = " + pair3.getValue());
    }
}