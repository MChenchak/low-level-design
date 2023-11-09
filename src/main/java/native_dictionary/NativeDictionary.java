package native_dictionary;

public abstract class NativeDictionary<T> {

    // конструктор
    // постусловие: создан пустой словарь заданного размера
    public NativeDictionary(int size) {
    }

    // команды
    // предусловие: в словаре имеется свободный слот для key и value;
    // постусловие: в словарь добавлены ключ и значение
    public abstract void put(String key, T value);

    // предусловие: в таблице имеется ключ key с соответствующим ему значением;
    // постусловие: из словаря удалены ключ key и соответствующее ему значение
    public abstract void remove(String key);

    // запросы
    public abstract T get(String key);
    public abstract int size(); // количество элементов в словаре

    // запросы статусов (возможные значения статусов)
    public abstract int get_put_status(); // успешно; система коллизий не смогла найти свободный слот для значения
    public abstract int get_remove_status(); // успешно; значения нет в словаре
}
