package power_set;

public abstract class HashTable<T> {

    private int size;

    // конструктор
    // постусловие: создана пустая хэш-таблица заданного размера
    public HashTable(int sz) {
        this.size = size;
    };

    // команды
    // предусловие: в таблице имеется свободный слот для value;
    // постусловие: в таблицу добавлено новое значение
    public abstract void put(T value);

    // предусловие: в таблице имеется значение value;
    // постусловие: из таблицы удалено значение value
    public abstract void remove(T value);

    // запросы
    public abstract boolean get(T value); // содержится ли значение value в таблице

    public abstract int size(); // количество элементов в таблице

    // запросы статусов (возможные значения статусов)
    public abstract int get_put_status(); // успешно;
    // система коллизий не смогла найти свободный слот для значения

    public abstract int get_remove_status(); // успешно; значения нет в таблице
}
