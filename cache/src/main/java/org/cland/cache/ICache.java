package org.cland.cache;

public interface ICache<K,V> {

    V get(K k);

    V put(K k,V v);

    V remove(K k);

    int size();
}
