package deque;

public abstract class Deque<T> extends ParentQueue<T> {

    // конструктор
    public Deque() {
    }

    // команды
    // постусловие: в хвост очереди добавлен новый элемент
    public abstract void enqueueFront(T item);

    // предусловие: очередь не пуста;
    // постусловие: из хвоста очереди удалён элемент
    public abstract void dequeueTail();

    // запросы статусов (возможные значения статусов)
    public abstract int get_dequeueFront_status(); // успешно; очередь пуста
}
