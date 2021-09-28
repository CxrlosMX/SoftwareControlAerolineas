/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelosclass;

import classpasajeros.Pasajeros;
import javax.swing.JOptionPane;
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

    public Vuelos(String ciudadOrigen, String ciudadDestino, double precioBoleto, int numMaxPasajeros, int numRealReservados) {
        this.identificador = generarIdentificador();
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precioBoleto = precioBoleto;
        this.numMaxPasajeros = numMaxPasajeros;
        this.pasajeros = new Pasajeros[numMaxPasajeros];
        this.numRealReservados = numRealReservados;
    }
    /*
     Tendremos un método para agregar un pasajero a nuestra lista
     */

    public void addPasajero(Pasajeros pasajero) {
        if (pasajeros[numMaxPasajeros - 1] == null) {
            boolean encontrado = false;
            for (int i = 0; i < pasajeros.length && !encontrado; i++) {
                if (pasajeros[i] == null) {
                    pasajeros[i] = pasajero;
                    JOptionPane.showMessageDialog(null, "Pasajero" + pasajero.getNombre() + "agregado con exito", "Pasajero Agregado", 1);
                    encontrado = true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro de vuelos lleno", "Registro lleno", 2);
        }
    }
    /*
     Mètodo para buscar pasajeros
     1.-Busqueda por itedarador del arreglo
     2.-Busqueda por Numero de pasaporte
     */

    public Pasajeros buscarPasajeroPoc(int n) {
        Pasajeros p = null;
        if (pasajeros[0] != null) {
            if (n >= 1 && n <= numMaxPasajeros) {
                boolean encontrado = false;
                for (int i = 0; i < pasajeros.length && !encontrado && pasajeros[i] != null; i++) {
                    if (pasajeros[n - 1] != null) {
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Pasajero encontrado", "Encontrado", 1);
                        p = pasajeros[i];
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Pasajero no encontrado", "No encontrado", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Introduce un valor valido por favor", "Parametro no valido", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro vacio", "Vacio", 2);
        }
        return p;
    }
    /*
     Mètodo para buscar por pasaporte
     */

    public Pasajeros buscarPasajeroPasaporte(String pasaporte) {
        Pasajeros p = null;
        if (pasajeros[0] != null) {
            boolean encontrado = false;
            for (int i = 0; i < pasajeros.length && !encontrado && pasajeros[i] != null; i++) {
                if (pasajeros[i].getNumeroPasaporte().equals(pasaporte)) {
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Pasajero encontrado", "Pasajero encontrado", 1);
                    p = pasajeros[i];
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Pasajero no encontrado", "No encontrado", 1);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Registro Vacio", "Vacio", 0);
        }

        return p;

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

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public void setNumMaxPasajeros(int numMaxPasajeros) {
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public void setPasajeros(Pasajeros[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setNumRealReservados(int numRealReservados) {
        this.numRealReservados = numRealReservados;
    }

    @Override
    public String toString() {
        return "Identificador del Vuelo: " + identificador + "\nCiudad Origen: " + ciudadOrigen + "\nCiudad de Destino: " + ciudadDestino + "\nPrecio del Boleto: " + precioBoleto + "$" + "\nCapacidad Maxima Vuelo: " + numMaxPasajeros + "\nLista Pasajeros: " + pasajeros + "\nAsientos Reservados: " + numRealReservados;
    }

}
