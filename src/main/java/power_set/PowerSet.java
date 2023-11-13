package power_set;

public abstract class PowerSet<T> extends HashTable<T>{

    // конструктор
    // постусловие: создан пустой сет заданного размера
    public PowerSet(int sz) {
        super(sz);
    }

    // запросы
    // предуслове: set2 != тnull
    public abstract boolean isSubset(PowerSet<T> set2); // Является set2 подмножеством исходного сета

    // предуслове: set2 != тnull
    public abstract PowerSet<T> Intersection(PowerSet<T> set2); // пересечение текущего множества и set2

    // предуслове: set2 != тnull
    public abstract PowerSet<T> Union(PowerSet<T> set2); // объединение текущего множества и set2

    // предуслове: set2 != тnull
    public abstract PowerSet<T> Difference(PowerSet<T> set2); // разница текущего множества и set2

}
