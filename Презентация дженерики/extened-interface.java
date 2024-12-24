// Пример использования параметризированнго интерфейса
interface Pair<K, V> {
    K getKey();
    V getValue();
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

class CustomPair<K, V> extends OrderedPair<K, V> {
    public CustomPair(K key, V value) {
        super(key, value);
    }
}

public class Main {
    public static void main(String[] args) {
        CustomPair pair1 = new CustomPair("One", 1);
        CustomPair pair2 = new CustomPair("2", 2);
        CustomPair pair3 = new CustomPair(3, "Three");

        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
        System.out.println("Key: " + pair3.getKey() + ", Value: " + pair3.getValue());
    }
}