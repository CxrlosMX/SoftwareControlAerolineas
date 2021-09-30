/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companiaclass;

import javax.swing.JOptionPane;
import metodos.MetodosGenericos;
import vuelosclass.Vuelos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 27-sep-2021
 *
 */
public class Company implements MetodosGenericos<Vuelos> {

    private String nombre;
    private Vuelos[] listaVuelos;
    private int numVuelosProximos;
    /*
     Lo que realizaremos sera una sobrecarga de constructores
     */

    public Company(String nombre) { //Constructor donde solo agregaremos el nombre de la compañia
        this.nombre = nombre;
        listaVuelos = new Vuelos[10];
        numVuelosProximos = 0;
    }

    public Company(String nombre, Vuelos[] listaVuelos) {//El constructor recibe como parametro la lista de vuelos y el nombre
        this.nombre = nombre;
        this.listaVuelos = listaVuelos;
        numVuelosProximos = listaVuelos.length;
    }
    /*
     Métodos para agregar y buscar vuelos
     */

    @Override
    public void addObject(Vuelos valor, Vuelos[] arreglo) {
        if (arreglo[arreglo.length - 1] == null) {
            boolean encontrado = false;
            for (int i = 0; i < arreglo.length && !encontrado; i++) {
                if (arreglo[i] == null) {
                    arreglo[i] = valor;
                    numVuelosProximos++;
                    JOptionPane.showMessageDialog(null, "Vuelo Registrado con Exito", "Registrado con exito", 1);
                    encontrado = true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es posible agregar màs vuelo", "Registro lleno", 2);
        }
    }

    @Override
    public Vuelos getObj(int i) {
        if (listaVuelos[0] != null) {
            if (i >= 1 && i <= listaVuelos.length) {
                if (listaVuelos[i] != null) {
                    return listaVuelos[i];
                }
                /*else {
                 JOptionPane.showMessageDialog(null, "Vuelo no encontrado", nombre, i);
                 }*/
            } else {
                JOptionPane.showMessageDialog(null, "Introduce una posiciòn Valida", "Parametro no valido", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro de vuelos vacio", "Registro Vacio", 2);
        }
        return null;
    }

    @Override
    public Vuelos getObj(String id) {
        if (listaVuelos[0] != null) {
            boolean encontrado = false;
            for (int i = 0; i < listaVuelos.length && !encontrado && listaVuelos[i] != null; i++) {
                if (listaVuelos[i].getIdentificador().equals(id)) {
                    encontrado = true;
                    return listaVuelos[i];
                }
            }
            //JOptionPane.showMessageDialog(null, id, id, numVuelosProximos);
        }
        return null;
    }

    //Get and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelos[] getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(Vuelos[] listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public int getNumVuelosProximos() {
        return numVuelosProximos;
    }

    public void setNumVuelosProximos(int numVuelosProximos) {
        this.numVuelosProximos = numVuelosProximos;
    }
    /*
     Método que recorre nuestro arreglo
     */

    public String valoresVuelos() {
        String cadena = "";
        if (listaVuelos[0] != null) {

            for (int i = 0; i < listaVuelos.length && listaVuelos[i] != null; i++) {
                cadena += " \n" + listaVuelos[i];
            }
        }

        return cadena;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nLista de Vuelos: " + valoresVuelos() + "\nNumero de Vuelos Proximos: " + numVuelosProximos;
    }

}
