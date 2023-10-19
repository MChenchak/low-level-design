package two_way_list;

public abstract class ParentList<T> {

    private static final int HEAD_OK = 1; // успешно
    private static final int HEAD_ERROR = 2; // список пуст
    private static final int TAIL_OK = 1; // успешно
    private static final int TAIL_ERROR = 2; // список пуст
    private static final int RIGHT_OK = 1; // успешно
    private static final int RIGHT_ERROR = 2; // правее нет элемента

    private static final int PUT_LEFT_OK = 1; // успешно
    private static final int PUT_LEFT_ERROR = 2; // список пуст

    private static final int PUT_RIGHT_OK = 1; // успешно
    private static final int PUT_RIGHT_ERROR = 2; // список пуст

    private static final int REMOVE_OK = 1; // успешно
    private static final int REMOVE_ERROR = 2; // список пуст

    private static final int REPLACE_OK = 1; // успешно
    private static final int REPLACE_ERROR = 2; // список пуст

    private static final int FIND_OK = 1; // следующий найден
    private static final int FIND_ERROR = 2; // следующий не найден
    private static final int FIND_NILL = 0; // список пуст

    private static final int GET_OK = 1; // успешно
    private static final int GET_ERROR = 2; // список пуст

    // конструктор
    // постусловие: создан новый пустой список
    public abstract ParentList<T> ParentList();

    // команды
    // предусловие: список не пуст;
    // постусловие: курсор установлен на первый узел в списке
    public abstract void head();

    // предусловие: список не пуст;
    // постусловие: курсор установлен на последний узел в списке
    public abstract void tail();

    // предусловие: правее курсора есть элемент;
    // постусловие: курсор сдвинут на один узел вправо
    public abstract void right();

    // предусловие: список не пуст;
    // постусловие: следом за текущим узлом добавлен
    // новый узел с заданным значением
    public abstract void put_right(T value);

    // предусловие: список не пуст;
    // постусловие: перед текущим узлом добавлен
    // новый узел с заданным значением
    public abstract void put_left(T value);

    // предусловие: список не пуст;
    // постусловие: текущий узел удалён,
    // курсор смещён к правому соседу, если он есть,
    // в противном случае курсор смещён к левому соседу,
    // если он есть
    public abstract void remove();

    // постусловие: список очищен от всех элементов
    public abstract void clear();

    // постусловие: новый узел добавлен в хвост списка
    public abstract void add_tail(T value);

    // постусловие: в списке удалены все узлы с заданным значением
    public abstract void remove_all(T value);

    // предусловие: список не пуст;
    // постусловие: значение текущего узла заменено на новое
    public abstract void replace(T value);

    // постусловие: курсор установлен на следующий узел
    // с искомым значением, если такой узел найден
    public abstract void find(T value);

    // запросы
    public abstract T get(); // предусловие: список не пуст
    public abstract boolean is_head();
    public abstract boolean is_tail();
    public abstract boolean is_value();
    public abstract int size();

    // запросы статусов (возможные значения статусов)
    public abstract int get_head_status(); // успешно; список пуст
    public abstract int get_tail_status(); // успешно; список пуст
    public abstract int get_right_status(); // успешно; правее нет элемента
    public abstract int get_put_right_status(); // успешно; список пуст
    public abstract int get_put_left_status(); // успешно; список пуст
    public abstract int get_remove_status(); // успешно; список пуст
    public abstract int get_replace_status(); // успешно; список пуст
    public abstract int get_find_status(); // следующий найден; следующий не найден; список пуст
    public abstract int get_get_status(); // успешно; список пуст

}
