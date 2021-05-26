
/**
 * Write a description of class MapNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapNode<K, V> extends Item<K, V> implements DoublyLinkedNode<K, V>
{
    private K k;
    private V v;
    private DoublyLinkedNode<K, V> prev;
    private DoublyLinkedNode<K, V> n;
    public MapNode(K key, V value, DoublyLinkedNode<K, V> previous, DoublyLinkedNode<K, V> next)
    {
        super(key, value);
    }

    /**
     * Returns the previous (upstream) node.
     */
    public DoublyLinkedNode<K, V> getPrevious()
    {
        return null;
    }

    /**
     * Sets the previous node.
     */
    public void setPrevious(DoublyLinkedNode<K, V> node)
    {

    }

    /**
     * Returns the next (downstream) node.
     */
    public DoublyLinkedNode<K, V> getNext()
    {
        return null;
    }

    /**
     * Sets the next (downstream) node.
     */
    public void setNext(DoublyLinkedNode<K, V> node)
    {

    }
}
