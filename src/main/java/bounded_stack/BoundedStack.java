package bounded_stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class BoundedStack<T> extends AbstractBoundedStack<T> {

    private final List<T> stack;
    private int peek_status;
    private int pop_status;

    private static final int DEFAULT_CAPACITY = 32;

    private final int POP_NIL = 0;
    private final int POP_OK = 1;
    private final int POP_ERR = 2;
    private final int PEEK_NIL = 0;
    private final int PEEK_OK = 1;
    private final int PEEK_ERR = 2;

    public BoundedStack(int capacity) {
        this.stack = new ArrayList<>(capacity);
    }

    public BoundedStack() {
        this.stack = new ArrayList<>(DEFAULT_CAPACITY);
    }

    @Override
    public void push(T value) {
        int len = this.size();
        if (len < DEFAULT_CAPACITY)
            stack.add(value);
    }

    @Override
    public void pop() {
        int len = this.size();
        if (len > 0) {
            stack.remove(len - 1);
            pop_status = POP_OK;
        }
        pop_status = POP_NIL;
    }

    @Override
    public T peek() {
        int len = this.size();
        if (len == 0) {
            this.peek_status = PEEK_NIL;
            throw new EmptyStackException();
        }
        this.peek_status = PEEK_OK;
        return stack.get(len - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public void clear() {
        stack.clear();
    }

    public int getPeek_status() {
        return peek_status;
    }

    public int getPop_status() {
        return pop_status;
    }
}
