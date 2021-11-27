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
public class Posicion {
    private int x;
    private int y;
    
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object o){
        if (o==null)
            return false;
        if (this==o)
            return true;
        if (this.getClass() != o.getClass())
            return false;
        Posicion other = (Posicion)o;
        return (this.x == other.x) && (this.y == other.y);
    }
}