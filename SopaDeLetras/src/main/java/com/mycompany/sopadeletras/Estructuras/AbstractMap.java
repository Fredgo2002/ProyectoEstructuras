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
          protected class KeyIterator implements Iterator<K> {
        private Iterator <Entry<K,V>> entries = entrySet().iterator();
        public boolean hasNext(){
           return entries.hasNext();
        }
        public K next(){
            return entries.next().getKey();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
        
    }
         protected class KeyIterable implements Iterable<K>{

        @Override
        public Iterator<K> iterator() {
            return new KeyIterator();
        }
        public Iterable<K> KeySet(){
            return new KeyIterable();
        }
    
}
         
    protected class ValueIterator implements Iterator<V>{
        private Iterator <Entry <K,V>> entries = entrySet().iterator();
        @Override
        public boolean hasNext() {
            return entries.hasNext();
        }
        @Override
        public V next() {
            return entries.next().getValue();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    protected class ValueIterable implements Iterable<V>{

        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
        public Iterable<V> values(){
            return new ValueIterable();
            
        }
        
    }
        
    }
 
   

    

