/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallercolas.model;

/**
 *
 * @author User
 */
public interface Entry<K,V> {
    K getKey( );
    V getValue( );
}
