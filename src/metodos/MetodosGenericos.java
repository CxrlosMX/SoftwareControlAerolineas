/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author CxrlosMX
 * @param <T>
 */
public interface MetodosGenericos<T> {

    void addObject(T objeto, T[] lista);

    T getObj(int i);
    T getObj(String i);
    
}
