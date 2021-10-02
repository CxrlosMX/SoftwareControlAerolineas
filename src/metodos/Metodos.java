/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author: CxrlosMX
 * @param <T>
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 24-sep-2021
 *
 */
public class Metodos<T> {

    public static int generarNumeroAleatorio(int max, int min) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static <T> String mostrarArreglo(T[] lista) {
        String cadena = "";
        for (int i = 0; i < lista.length && lista[i]!=null; i++) {
            cadena+="\n"+i;
        }
        
        return cadena;
    }

}
