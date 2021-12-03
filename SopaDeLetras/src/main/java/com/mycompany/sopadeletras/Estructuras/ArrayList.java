/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras.Estructuras;
import com.mycompany.tallercolas.model.Entry;
import java.util.Iterator;
import java.util.Arrays;
import java.util.NoSuchElementException;
import com.mycompany.sopadeletras.Estructuras.ArrayList;
/**
 *
 * @author User
 */
public class ArrayList <E> implements List<E> {
    public static final int Capacidad=1000;
    private E[] data;
    private int size=0;

    @Override
    public int size() {return size;}
    public ArrayList(E[] content){
        data =  content;
        
    }
   
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArrayList<?> other = (ArrayList<?>) obj;
        if (this.size != other.size) {
            return false;
        }
        if (!Arrays.deepEquals(this.data, other.data)) {
            return false;
        }
        return true;
    }
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
    public void add(E e) {
        size++;
        add(size,e);                
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
    private class iteratorArray implements Iterator<E>{
                private int j=0 ;
        @Override
        public boolean hasNext() {
            return j < size();        }

        @Override
        public E next() {
            if (j== size()){
            throw new NoSuchElementException();
            }
            return get(j++);
        }        
    }
    private class ArrayIterator implements Iterator<E>{
        private int j=0;
        private boolean removable = false;

        @Override
        public boolean hasNext() {
            return j <size;
        }

        @Override
        public E next() throws NoSuchElementException {
            if(j==size) throw new NoSuchElementException("no hay proximo elemento");
            removable = true;
            return data[j++];
        }

        @Override
        public void remove() {
            if(!removable) throw new IllegalStateException("nada para remover");
            ArrayList.this.remove(j-1);
            removable = false;
        }
        
    }public Iterator<E> iterator(){
            return new ArrayIterator();
        }
      
        
            
    
        
        
        }


