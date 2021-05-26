
/**
 * Write a description of class LinkedMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedMap<K, V> implements Map<K, V>
{
    private DoublyLinkedNode<K, V> front;
    public LinkedMap()
    {
        front = null;
    }

    /**
     * Returns the number of entries in this Map.
     */
    public int size()
    {
        DoublyLinkedNode<K, V> curr = front;
        int size = 0;
        while(curr != null)
        {
            size++;
            curr = curr.getNext();
        }
        return size;
    }

    /**
     * Returns true if this Map is empty; otherwise, returns false.
     */
    public boolean isEmpty()
    {
        return front == null;
    }

    /**
     * Returns true if an entry in this Map with key exists;
     * Returns false otherwise.
     * @throws IllegalArgumentException if key is null
     */
    public boolean containsKey(K key)
    {

        if(key == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }
        DoublyLinkedNode<K, V> curr = front;
        while(curr != null)
        {
            if(key.equals(curr.getKey()))
            {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    /**
     * Returns true if an entry in this Map with value exists;
     * Returns false otherwise.
     */
    public boolean containsValue(V value)
    {
        if(value == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }
        DoublyLinkedNode<K, V> curr = front;
        while(curr != null)
        {
            if(value.equals(curr.getValue()))
            {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    /** 
     * If an entry in this map with a key exists then the value associated 
     * with that entry is returned; otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V get(K key)
    {
        if(key == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }
        DoublyLinkedNode<K, V> curr = front;
        while(curr != null)
        {
            if(key.equals(curr.getKey()))
            {
                return curr.getValue();
            }
            curr = curr.getNext();
        }
        return null;
    }

    /** 
     * If an entry in this map with key already exists then the value 
     * associated with that entry is replaced by value and the original
     * value is returned; otherwise, adds the (key, value) pair to the map
     * and returns null. 
     * @throws IllegalArgumentException if key is null
     */
    public V put(K key, V value)
    {
        if(key == null || value == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }
        V temp = remove(key);
        DoublyLinkedNode<K, V> newN = new MapNode(key, value,  null, front);
        if(front != null)
        {
            front.setPrevious(newN);
        }
        return temp;
    }

    /**
     * If an entry in this map with key exists then the entry is removed
     * from the map and the value associated with that entry is returned;
     * otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V remove(K key)
    {
        if(key == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }
        DoublyLinkedNode<K, V> curr = front;
        while(curr != null)
        {
            if(key.equals(curr.getKey()))
            {
                V temp = curr.getValue();
                DoublyLinkedNode<K, V> prev = curr.getPrevious();
                DoublyLinkedNode<K, V> next = curr.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
                return temp;
            }
            curr = curr.getNext();
        }
        return null;
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear()
    {
        front = null;
    }
}
