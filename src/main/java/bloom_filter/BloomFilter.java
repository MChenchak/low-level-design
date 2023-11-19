package bloom_filter;

public abstract class BloomFilter<T> {

    // конструктор
    // постусловеие: создан фильтр с заданной длиной битового массива
    public BloomFilter(int len) {
    }

    // команды

    // постусловие: в фильтр добавлено значение - значение в соответствующих позициях массив изменено на 1
    public abstract void add(T val);


    // запросы
    public abstract boolean isValue(T val);


    // хэш-функции
    public abstract int hash1(T val);
    public abstract int hash2(T val);
}
