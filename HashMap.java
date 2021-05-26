
/**
 * Write a description of class HashMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashMap<K, V> implements Map<K, V>, Hashable<K, V>
{
    private Map<V, K>[] table;
    public HashMap(int size)
    {
        table = new Map[size];
        for(int i = 0; i < table.length; i++)
        {
            table[i] = new LinkedMap();
        }
    }

    /**
     * Returns the number of entries in this Map.
     */
    public int size()
    {
        return -1;
    }

    /**
     * Returns true if this Map is empty; otherwise, returns false.
     */
    public boolean isEmpty()
    {
        return false;
    }

    /**
     * Returns true if an entry in this Map with key exists;
     * Returns false otherwise.
     * @throws IllegalArgumentException if key is null
     */
    public boolean containsKey(K key)
    {
        return false;
    }

    /**
     * Returns true if an entry in this Map with value exists;
     * Returns false otherwise.
     */
    public boolean containsValue(V value)
    {
        return false;
    }

    /** 
     * If an entry in this map with a key exists then the value associated 
     * with that entry is returned; otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V get(K key)
    {
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
        return null;
    }

    /**
     * If an entry in this map with key exists then the entry is removed
     * from the map and the value associated with that entry is returned;
     * otherwise null is returned.
     * @throws IllegalArgumentException if key is null
     */
    public V remove(K key)
    {
        return null;
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear()
    {

    }

    public int hashIndex(K key)
    {
        return -1;
    }
}
