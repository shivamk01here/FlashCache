import java.util.HashMap; 

public class FlashCache<K, V>{

    private HashMap<K, V> cache; 

    public FlashCache(){
        this.cache = new HashMap<>(); 
    }

    public void put(K key, V value){
        cache.put(key, value);
        System.out.println("stored " + key + " -> " +  value); 
    }

    public V get(K key){
       return cache.get(key);
    }

    public void remove(K key){
        cache.remove(key);
        System.out.println("removed " + key); 
    }

    public static void main(String[] args){
        FlashCache<String, String> myCache = new FlashCache<>();
        System.out.println("--- Starting FlashCache ---");

        myCache.put("user_1", "Alice");
        myCache.put("user_2", "Bob");

        String user = myCache.get("user_1");
        System.out.println("Retrieved: " + user);

        myCache.remove("user_2");

        System.out.println("--- Ending FlashCache ---");
    }
}