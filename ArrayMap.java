import java.util.*;
/**
 * Write a description of class ArrayMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMap<K, V> implements Map<K, V>, Iterable<MapItem <K, V>>
{
    // instance variables - replace the example below with your own
    private ArrayList<MapItem <K, V>> map;

    public ArrayMap()
    {
        map = new ArrayList();
    }

    public int size()
    {
        return map.size();
    }

    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    public boolean containsKey(K key)
    {
        if(key == null)
        {
            throw new IllegalArgumentException("Key cannot be null");
        }

        for(int i = 0; i < map.size(); i++)
        {
            if(map.get(i).getKey().equals(key))
            {
                return true;
            }
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
            throw new IllegalArgumentException("Value cannot be null");
        }

        for(int i = 0; i < map.size(); i++)
        {
            if(map.get(i).getValue().equals(value))
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
            throw new IllegalArgumentException("Key cannot be null!");
        }

        for(int i = 0; i < map.size(); i++)
        {
            if(map.get(i).getKey().equals(key))
            {
                return map.get(i).getValue();
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
            throw new IllegalArgumentException("Key cannot be null!");
        }
        MapItem<K,V> item = new Item<K,V>(key, value);
        MapItem<K,V> curr;
        Iterator<MapItem<K,V>> search = map.iterator();
        while(search.hasNext())
        {
            curr = search.next();
            if(curr.getKey().equals(key))
            {
                search.remove();
                map.add(item);
                return curr.getValue();
            }
        }
        map.add(item);
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
        if(key == null)
        {
            throw new IllegalArgumentException("Key cannot be null!");
        }
        //MapItem<K,V> item = new Item<K,V>(key, value);
        MapItem<K,V> curr;
        Iterator<MapItem<K,V>> search = map.iterator();
        while(search.hasNext())
        {
            curr = search.next();
            if(curr.getKey().equals(key))
            {
                search.remove();
                //map.add(item);
                return curr.getValue();
            }
        }
        //map.add(item);
        return null;
    }

    /**
     * Removes all of the mappings from this map. The map will be empty 
     * after this call returns.
     */
    public void clear()
    {
        map.clear();
    }

    public Iterator<MapItem<K,V>> iterator()
    {
        return map.iterator();
    }
}
