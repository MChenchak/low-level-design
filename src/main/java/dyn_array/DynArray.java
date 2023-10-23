package dyn_array;

import two_way_list.ParentList;

public abstract class DynArray<T> extends ParentList<T> {

    // конструкторы

    // постусловие: создан новый пустой список. default capacity = 10
    protected DynArray() {
    }

    // команды

    // постусловие: изменен размер массива
    public abstract void makeArray(int new_capacity);


    // запросы
    // предусловие: capacity >= index
    public abstract T getItemByIndex(int index);


}
