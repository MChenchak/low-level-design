package hash_table;

public abstract class HashTable<T> {

    private final int maxSize;

    // конструкторы
    public HashTable(int maxSize) {
        this.maxSize = maxSize;
    }

    // команды
    // предусловие: в хэш-таблице есть свободные слоты либо не превышено допустимое количество коллизий при записи в непустой слот
    // постусловие: в таблиу добавлено новое значение
    public abstract void put(T val);


    // запросы
    // предусловие: хэш-таблица не пуста
    public abstract T get(T val);
    public abstract int size();
    public abstract boolean isEmpty();


    // запросы статусов (возможные значения статусов)
    public abstract int getPutStatus(); // успешно; таблица полностью заполнена; превышен лимит разрешения коллизий
    public abstract int getGetStatus(); // успешно; таблица пуста


    // вспомогательные запросы
    public abstract int hashFunc(T val);
}

