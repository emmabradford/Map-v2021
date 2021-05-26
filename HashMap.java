
/**
 * Write a description of class HashMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashMap<K, V> implements Map<K, V>, Hashable<K, V>
{
    private Map<K, V>[] table;
    private int size;
    public HashMap(int size)
    {
        table = new Map[size];
        for(int i = 0; i < table.length; i++)
        {
            table[i] = new LinkedMap();
        }
        size = 0;
    }

    /**
     * Returns the number of entries in this Map.
     */
    public int size()
    {
        return size;
    }

    /**
     * Returns true if this Map is empty; otherwise, returns false.
     */
    public boolean isEmpty()
    {
        return size == 0;
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

        if(get(key)!= null)
        {
            return true;
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
        for(Map<K, V> a : table)
        {
            if(a.containsValue(value))
            {
                return true;
            }
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
        for(Map<K, V> a : table)
        {
            if(a.containsKey(key))
            {
                return a.get(key);
            }
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
        if(key == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }
        Map <K, V> a = table[hashIndex(key)];
        V old = a.put(key, value);
        if(old == null)
        {
            size++;
        }
        return old;
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
        Map<K, V> a = table[hashIndex(key)];
        V old = a.remove(key);
        if(old != null)
        {
            size--;
        }
        return old;
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear()
    {
        for(int i = 0; i < table.length; i++)
        {
            table[i] = new LinkedMap();
        }
        size = 0;
    }

    public int hashIndex(K key)
    {
        return (key.hashCode() & 0x7fffffff) % table.length;
    }
}
