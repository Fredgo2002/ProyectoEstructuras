/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;

/**
 *
 * @author User
 */
public interface List <E>{ // define la estructura que siguen las clases lineales
    int size();
    boolean isEmpty();// Comprueba si esta vacio
    E get (int i) throws IndexOutOfBoundsException;
    E set (int i  , E e) throws IndexOutOfBoundsException;
    void add (int i,E e) throws IndexOutOfBoundsException;
    E remove (int i) throws IndexOutOfBoundsException;


    
  
    
    
}
