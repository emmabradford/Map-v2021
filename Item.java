
/**
 * Write a description of class Stinky here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item<K, V> implements MapItem <K, V>
{
    private K key;
    private V val;
    
    public Item(K k, V v)
    {
        key = k;
        val = v;
    }   
    
    /**
     * Returns the key of this MapItem.
     */
    public K getKey()
    {
        return key; 
    }

    /**
     * Returns the value of this MapItem.
     */
    public V getValue()
    {
        return val;
    }
    
    //public 
    /**
     * Returns a string representing this MapItem.
     */
    public String toString()
    {
        return "Key  : " + key + "\nValue: " + val;
    }
}
