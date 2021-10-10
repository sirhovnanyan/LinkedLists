package linkedlist;

public interface MyList<T> {
    T get(int index);

    void add(T obj);

    void remove(int index);

    boolean remove(T obj);

    int size();

    boolean contains(T obj);

    void addFirst(T obj);

    void addLast(T obj);

    T removeFirst();

    T removeLast();

    void push(T obj);

    T pop();

    boolean offerFirst(T obj);

    boolean offerLast(T obj);

    T poll();

    T pollFirst();

    T pollLast();

    ListIterator<T> iterator();

    Iterator<T> descendingIterator();

    interface ListIterator<T> {
        boolean hasNext();

        T next();

        boolean hasPrevious();

        T previous();
    }

    interface Iterator<T> {
        boolean hasNext();

        T next();
    }

}
