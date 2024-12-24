public static void printList(List<? extends Number> list) {
    for (Number number : list) {
        System.out.print(number + " ");
    }
    System.out.print("\n");
}

public static void addNumbers(List<? super Integer> list) {
    list.add(123);
}

public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    List<Number> numberList = new ArrayList<>();
    List<Object> objectList = new ArrayList<>();

    addNumbers(integerList);    // Запуск с List<Integer>
    addNumbers(numberList);     // Запуск с List<Number>
    addNumbers(objectList);     // Запуск с List<Object>

    List<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);

    List<Double> doubleList = new ArrayList<>();
    doubleList.add(1.1);
    doubleList.add(2.2);    
    doubleList.add(3.3);

    System.out.print(intList + "\n");
    System.out.print(numberList + "\n");
    System.out.print(objectList + "\n");

    printList(intList);     // Запуск с List<Integer>
    printList(doubleList);  // Запуск с List<Double>
}