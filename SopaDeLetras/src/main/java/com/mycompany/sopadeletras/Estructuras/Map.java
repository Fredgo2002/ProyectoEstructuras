/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;

import com.mycompany.tallercolas.model.Entry;

/**
 *
 * @author User
 */
public interface Map<K,V>{
    int size();
    boolean isEmpty();
    V get (K key);
    V put(K key , V value);
    V remove(K key);
    Iterable<K> keySet();
    Iterable<V> valueSet();
    Iterable<Entry<K,V>> entrySet();
    
}
