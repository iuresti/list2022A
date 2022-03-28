package uaslp.objetos.list;

public interface List <T> {

    /**
     * Añade al final de la lista
     * @param data Dato a ser añadido
     */
    void addAtTail(T data);

    void addAtFront(T data);

    void remove(int index);

    void removeAll();

    /**
     *
     * @param index
     * @param data
     */
    void setAt(int index, T data);

    /**
     *
     * @param index
     * @return
     */
    T getAt(int index);

    Iterator<T> getIterator();

    int getSize();
}
