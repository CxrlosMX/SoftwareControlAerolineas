/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 24-sep-2021
 *
 */
public class Metodos {

    public static int generarNumeroAleatorio(int max, int min) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

}
