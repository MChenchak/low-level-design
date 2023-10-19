package two_way_list;

import linked_list.LinkedList;

public abstract class TwoWayList<T> extends ParentList<T>{

    public TwoWayList() {
    }

    // конструктор
    public abstract TwoWayList<T> TwoWayList();

    public static final int LEFT_OK = 1; // успешно
    public static final int LEFT_ERROR = 0; // левее нет элемента

    // предусловие: левее курсора есть элемент;
    // постусловие: курсор сдвинут на один узел влево
    public abstract void left();

    public abstract int getLeftStatus(); // успешно; левее нет элемента

}
