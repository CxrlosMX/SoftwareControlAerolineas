/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertosclass;

import classpasajeros.Pasajeros;
import metodos.Metodos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 24-sep-2021
 *
 */
public class Vuelos {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precioBoleto;
    private int numMaxPasajeros;
    private Pasajeros[] pasajeros;
    private int numRealReservados;

    public Vuelos(String ciudadOrigen, String ciudadDestino, double precioBoleto, int numMaxPasajeros, Pasajeros[] pasajeros, int numRealReservados) {
        this.identificador = generarIdentificador();
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precioBoleto = precioBoleto;
        this.numMaxPasajeros = numMaxPasajeros;
        this.pasajeros = pasajeros;
        this.numRealReservados = numRealReservados;
    }

    private String generarIdentificador() {
        char letra;

        String cadena = "";
        for (int i = 0; i < 4; i++) {
            int n = Metodos.generarNumeroAleatorio(2, 1);
            if (n == 1) {//Letras
                n = Metodos.generarNumeroAleatorio(90, 65);
                letra = (char) n;
                cadena += letra;
            } else {//Números
                 n = Metodos.generarNumeroAleatorio(57, 48);
                letra = (char) n;
                cadena += letra;
            }
        }
        return cadena;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public Pasajeros[] getPasajeros() {
        return pasajeros;
    }

    public int getNumRealReservados() {
        return numRealReservados;
    }

    @Override
    public String toString() {
        return "Identificador del Vuelo: " + identificador + "\nCiudad Origen: " + ciudadOrigen + "\nCiudad de Destino: " + ciudadDestino + "\nPrecio del Boleto: " + precioBoleto +"$"+ "\nCapacidad Maxima Vuelo: " + numMaxPasajeros + "\nLista Pasajeros: " + pasajeros + "\nAsientos Reservados: " + numRealReservados ;
    }

}
