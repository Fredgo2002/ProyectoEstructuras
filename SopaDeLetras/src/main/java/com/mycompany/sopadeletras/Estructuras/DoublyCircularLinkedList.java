/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;

import com.mycompany.tallercolas.model.Entry;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author User
 */
public class DoublyCircularLinkedList<E> {
    private DoublyCircularNodeList<E> last;
    private int size = 0;
    
    public DoublyCircularLinkedList(){}

    public DoublyCircularNodeList<E> getLast() {
        return last;
    }

    public void setLast(DoublyCircularNodeList<E> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }
    
    public DoublyCircularNodeList<E> getHeader(){
        return this.last.getNext();
    }
    
    public boolean isEmpty() { 
        return size == 0; 
    }
    
    public void addFirst(E elemento){
        if (elemento != null){
            if(isEmpty()){
            last = new DoublyCircularNodeList<>(elemento);
            last.setNext(last);
            }else{
                DoublyCircularNodeList<E> nuevo = new DoublyCircularNodeList<>(elemento);
                last.getNext().setPrevious(nuevo);
                nuevo.setNext(last.getNext());
                last.setNext(nuevo);

            }
            size++;
        }
        
    }
    
    public void addLast(E elemento){
        if (elemento != null){
            if (isEmpty()){
                last = new DoublyCircularNodeList<>(elemento);
            }else{
             DoublyCircularNodeList<E> nuevo = new DoublyCircularNodeList<>(elemento);
            last.getNext().setPrevious(nuevo);
            nuevo.setNext(last.getNext());
            last.setNext(nuevo);
            this.setLast(nuevo);
            size++;   
            }
            
        }
    }
    
    public void frontRotate(){
        this.setLast(last.getPrevious());
    }
    
    public void backRotate(){
        this.setLast(last.getNext());
    }
    
    public E  removeFirst(){
        if (!isEmpty()){
            return null;
        }else{
            DoublyCircularNodeList<E> node = getHeader();
            node.getNext().setPrevious(node.getPrevious());
            node.getPrevious().setNext(node.getNext());
            node.setNext(null);
            node.setPrevious(null);
            size--;
            return node.getContent();
        }
      
    }
    public void clean(){
        for(int i =0 ; i<this.size ;i++){
            this.removeFirst();
        }
    }
    
    
    
}
