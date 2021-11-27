/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 * @param <E> Parametrizado
 */
public interface List <E> {
    //default , estatico , final --- abstracta
    int size();
    boolean isEmpty();
    E get(int i);
    E set(E a , int i);
    void add(E a);
    E remove (int i);
}
