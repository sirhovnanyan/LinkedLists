package linkedlist;

public interface MyList {
    Integer get(int index);

    void add(Integer obj);

    void remove(int index);

    boolean remove(Integer obj);

    int size();

    boolean contains(Integer obj);

    Iterator iterator();

    interface Iterator {
        boolean hasNext();

        int next();
    }
}
