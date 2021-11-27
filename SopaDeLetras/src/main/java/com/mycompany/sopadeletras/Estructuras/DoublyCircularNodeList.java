/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;

/**
 *
 * @author Dell
 */
public class DoublyCircularNodeList <E> {
    private DoublyCircularNodeList <E> next;
    private DoublyCircularNodeList <E> previous;
    private E content;
    
    public DoublyCircularNodeList(E content){
        this.content = content;
        this.next = this;
        this.previous = this;
    }
    public DoublyCircularNodeList(){
        
    }

    public DoublyCircularNodeList<E> getNext() {
        return next;
    }

    public void setNext(DoublyCircularNodeList<E> next) {
        this.next = next;
    }

    public DoublyCircularNodeList<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyCircularNodeList<E> previous) {
        this.previous = previous;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }
    
    
}
