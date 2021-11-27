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
public class ArrayList <E> implements List<E> {
    public static final int Capacidad=16;
    private E[] data;
    private int size=0;

    @Override
    public int size() {return size;}
    public ArrayList(){
       data= (E[]) new Object[Capacidad];}
    public ArrayList(int Capacity){
        data = (E[]) new Object[Capacity];
    }
    @Override
    public boolean isEmpty() { return size ==0;   }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i,size);
        return data[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {// retorna el elemento reemplazado
        checkIndex(i,size);
        E temp = data[i];
        data[i]=e;
        return temp;
        

    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException , IllegalStateException{
        checkIndex(i,size+1);
        if(size==data.length){
            resize(2*data.length);
        }
        for(int k=size-1;k>= size();k--){
            data[k+1]=data[k]; 
        }
        data[i]=e;
        size++;

    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i,size);
        E temp = data[i];
        for(int k=i;k < size-1; k++){
            data[k]=data[k+1]; 
        }
        data[size-1]=null;
        size--;
        return temp;
        
    }
    /// utility method
    public void checkIndex(int i , int n) throws IndexOutOfBoundsException{
        if(i< 0 || i >= n){
            throw new IndexOutOfBoundsException("Indice Invalido: "+ i);
        
    }
        
    }
    public void resize(int i){
        E[] temp = (E[]) new Object[i];
        for(int k=0;k<size;k++){
            temp[k]=data[k];
           
        }
        data=temp;
        
    }
    
}

