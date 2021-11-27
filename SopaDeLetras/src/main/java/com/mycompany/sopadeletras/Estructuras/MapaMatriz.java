/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;

import com.mycompany.sopadeletras.InicioController;
import com.mycompany.tallercolas.model.Entry;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author User
 */
public class MapaMatriz <K,V> extends AbstractMap<K,V>{
    private java.util.ArrayList<MapEntry<K,V>> matriz = new java.util.ArrayList<>();// implementar arralist
    public MapaMatriz(){
    }
    private int findIndex(K key){
        int n= matriz.size();
        for(int i =0 ; i<n ;i++){
            if(matriz.get(i).getKey().equals(key)){
                return i;
            }
        }return -1;
    }
    
    @Override
    public int size() {
        return matriz.size();
    }

    @Override
    public V get(K key) {
        int j = findIndex(key);
        if(j==-1){
            return null;
        }
     return matriz.get(j).getValue();
    }

    @Override
    public V put(K key, V value) {
        int j = findIndex(key);
        if(j==-1){
            matriz.add(new MapEntry<>(key,value));
            return null;
        }else{
            return matriz.get(j).setValue(value);
        }
    }

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        return new EntryIterable();
    }

    @Override
    public Iterable<K> keySet() {
        return new KeyIterable();
    }

    @Override
    public Iterable<V> valueSet() {
        return new ValueIterable() ;
    }
    private class EntryIterator implements Iterator<Entry<K,V>>{
        private int j=0 ;

        @Override
        public boolean hasNext() {
            return j < matriz.size();
        }

        @Override
        public Entry<K, V> next() {
            if (j== matriz.size()){
            throw new NoSuchElementException();
            }
            return matriz.get(j++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
        
    }
    private class EntryIterable implements Iterable <Entry<K,V>>{
        @Override
        public Iterator <Entry<K,V>> iterator(){
            return new EntryIterator();
        }
        public Iterable <Entry<K,V>> entrySet(){
            return new EntryIterable();
        }
    }

    @Override
    public V remove(K key) {
        int j = findIndex(key);
        int n = size();
        if(j==-1){
            return null;
        }
        V answer = matriz.get(j).getValue();
        if(j!=n-1){
            matriz.set(j, matriz.get(n-1));   
                    matriz.remove(n-1);

        }
        return answer;
    }
       private class KeyIterator implements Iterator<K> {
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
         private class KeyIterable implements Iterable<K>{

        @Override
        public Iterator<K> iterator() {
            return new KeyIterator();
        }
        public Iterable<K> KeySet(){
            return new KeyIterable();
        }
    
}
         
    private class ValueIterator implements Iterator<V>{
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
    private class ValueIterable implements Iterable<V>{

        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
        public Iterable<V> values(){
            return new ValueIterable();
            
        }
        
    }
        
    }
    

