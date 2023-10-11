package bounded_stack;


/**
 * Ограниченный стек. Максимальный размер стека - 32 элемента.
 * <p> По умолчанию формируется стек максимум на 32 элемента.
 * @param <T>
 */
public abstract class AbstractBoundedStack<T> {
    /**
     * <p>Предусловие: в стеке есть "свободный" элемент.
     * <p>Постусловие: в стек добавлено новое значение.
     */
    public abstract void push(T value);

    /**
     * Предусловие: стек не пустой;
     * <p>Постусловие: из стека удалён верхний элемент
     */
    public abstract void pop();

    /**
     * Предусловие: стек не пустой
     */
    public abstract T peek();

    public abstract int size();

    /**
     * Постусловие: из стека удалятся все значения
     */
    public abstract void clear();
}
