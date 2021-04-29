package org.cland.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K,V> implements ICache<K,V>{

    int max=0;

    Map<K,V> store;

    public LRU(int max){
        this.max=max;
        this.store=new LinkedHashMap<K,V>(16,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return this.size()>max;
            }
        };
    }

    @Override
    public V get(K k) {
        return store.get(k);
    }

    @Override
    public V remove(K k) {
      return store.remove(k);
    }

    @Override
    public V put(K k, V v) {
      return store.put(k,v);
    }

    @Override
    public int size() {
        return store.size();
    }
}
