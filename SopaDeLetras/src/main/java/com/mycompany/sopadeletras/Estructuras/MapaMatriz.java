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
import java.lang.Integer;
import com.mycompany.sopadeletras.Estructuras.MapEntry;

/**
 *
 * @author User
 */
public class MapaMatriz <K,V> extends AbstractMap<K,V>{
    private ArrayList<MapEntry<K,V>> table = new ArrayList<>( );

 /** Constructs an initially empty map. */
public MapaMatriz( ) { } 
public MapaMatriz(K key , V value){
    MapEntry mt1 = new MapEntry(key,value);
    table.add(mt1);
}
 private int findIndex(K key) {  
     int n = table.size( );
     if(table.isEmpty()){
            return -1;           
        }else{
    for (int j=0; j < n; j++)
        if(table.get(j).getKey( ).equals(key)){
        return j;}
        
    return -1; 
 
 }
 }
public int size( ) { 
    return table.size( ); }  
 public V get(K key) {  
     int j = findIndex(key);
    if (j == -1) 
    return null; // not found
 return table.get(j).getValue( );
 }  
 public V put(K key, V value) {  
     int j = findIndex(key);
 if (j == -1) {  
     table.add(new MapEntry<>(key, value)); 
    return null;
 } else // key already exists
    return table.get(j).setValue(value); 
 }  
 public V remove(K key) {  
     int j = findIndex(key);
    int n = size( );
    if (j == -1) return null; 
 V answer = table.get(j).getValue( );
    if (j != n -1)
table.set(j, table.get(n-1)); 
 table.remove(n-1); 
 return answer;
 }  

    @Override
    public Iterable<V> valueSet() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 private class EntryIterator implements Iterator<Entry<K,V>> {  
     private int j=0;
 public boolean hasNext( ) { 
     return j < table.size( ); }  
 public Entry<K,V> next( ) {  
     if (j == table.size( )) throw new NoSuchElementException( );
 return table.get(j++);
 }  public void remove( ) { throw new UnsupportedOperationException( ); } } 
 private class EntryIterable implements Iterable<Entry<K,V>> {  
     public Iterator<Entry<K,V>> iterator( ) { 
         return new EntryIterator( ); }  }  
 public Iterable<Entry<K,V>> entrySet( ) { 
     return new EntryIterable( ); }  }




    

