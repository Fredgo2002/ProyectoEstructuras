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
public class MapEntry<K,V> implements Entry<K,V> {
   
private K k; // key
 private V v; // value
public MapEntry(K key, V value) {  k = key;
 v = value;
 }  // public methods of the Entry interface

   
 public K getKey( ) { return k; }  public V getValue( ) { return v; } // utilities not exposed as part of the Entry interface
 protected void setKey(K key) { k = key; }  protected V setValue(V value) {  V old = v;
 v = value;
 return old;
}  } //

