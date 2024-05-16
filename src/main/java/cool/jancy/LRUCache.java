package cool.jancy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : LRUCache
 * @description: TODO
 * @date 2024/5/15 下午6:02
 */
public class LRUCache extends LinkedHashMap {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry entry) {
        return size() > capacity;
    }

    public int get(int key) {
        return (int) super.get(key);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }
}
