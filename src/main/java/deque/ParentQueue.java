package deque;

public abstract class ParentQueue<T>{

    // конструктор
    // постусловие: создана пустая очередь
    public abstract ParentQueue<T> Queue();

    // команды
    // постусловие: в хвост очереди добавлен новый элемент
    public abstract void enqueue(T value);

    // предусловие: очередь не пуста;
    // постусловие: из головы очереди удалён элемент
    public abstract void dequeue();

    // запросы
    // предусловие: очередь не пуста
    public abstract T getFront(); // получить элемент из головы очереди;

    public abstract int size(); // текущий размер очереди

    // запросы статусов (возможные значения статусов)
    public abstract int get_dequeue_status(); // успешно; очередь пуста
    public abstract int get_get_status(); // успешно; очередь пуста

}
