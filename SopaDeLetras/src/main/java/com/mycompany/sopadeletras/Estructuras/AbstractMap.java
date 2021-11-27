/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;

import com.mycompany.tallercolas.model.Entry;
import java.util.Iterator;

/**
 *
 * @author User
 */
public abstract class AbstractMap <K,V> implements Map<K,V> {
       @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    protected static class MapEntry<K,V> implements Entry<K,V>{
        private K k;
        private V v;
        public MapEntry(K key , V value){
            k=key;
            v=value;
        }

        @Override
        public K getKey() {
            return k;        }

        @Override
        public V getValue() {
            return v;
        }
        protected void setKey(K key){
            k=key;
        }
        protected V setValue(V value){
            V old = v;
            v=value;
            return old;
        }
        
        
    }
 
   

    
}
