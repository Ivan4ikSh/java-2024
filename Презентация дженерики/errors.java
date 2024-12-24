// Невозможно явно вызвать конструктор
class Failed1<T> {
    private T t = new T(); // Ошибка
}

// Generic-поля не могут быть статическими:
class Failed2<T> {
    static T t; // Ошибка
}

// Статичестике методы не могут иметь generic-параметры
class Failed3<T> {
    static void func(T t) { } // Ошибка
}

// Generic-типы не могут быть примитивными
class Failed4<T> {
    static void func(T t) { } // Ошибка
}