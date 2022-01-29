package list;

/**
 * Generic base for sorted list implementation.
 * @param <S> comparable list element
 */
public interface SortedList<S extends Comparable<S>> {
    /**
     * Inserts an element at the corrected position
     * @param element new list element
     */
    void insert(S element);

    /**
     * Removes an element
     * @param index of the element which should be deleted
     * @return true if the deletion was successful, false otherwise
     */
    boolean delete(int index);

    /**
     * Returns a list element
     * @param index of the list element
     * @return the corresponding element null if the element was not found
     */
    S get(int index);

    /**
     *
     * @return size of the list
     */
    int size();
}
