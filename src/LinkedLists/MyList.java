package LinkedLists;

public interface MyList {
    Integer get(int index);

    void add(Integer obj);

    void remove(int index);

    boolean remove(Integer obj);

    int size();

    boolean contains(Integer obj);
}
