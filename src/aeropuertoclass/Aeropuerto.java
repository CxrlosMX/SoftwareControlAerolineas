/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertoclass;

import companiaclass.Company;
import javax.swing.JOptionPane;
import metodos.Metodos;
import metodos.MetodosGenericos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 29-sep-2021
 *
 */
public class Aeropuerto implements MetodosGenericos<Company> {

    private String nombre;
    private String ciudad;
    private String pais;
    private Company[] listaCompanias;
    private int numCompania;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompanias = new Company[10];
        this.numCompania = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Company[] listaCompanias) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompanias = listaCompanias;
        this.numCompania = listaCompanias.length;
    }
    /*
     Métodos
     */

    @Override
    public void addObject(Company objeto) {
        if (listaCompanias[listaCompanias.length - 1] == null) {
            boolean encontrado = false;
            for (int i = 0; i < listaCompanias.length && !encontrado; i++) {
                if (listaCompanias[i] == null) {
                    listaCompanias[i] = objeto;
                    numCompania++;
                    JOptionPane.showMessageDialog(null, "Vuelo Registrado con Exito", "Registrado con exito", 1);
                    encontrado = true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es posible agregar màs vuelo", "Registro lleno", 2);
        }
    }

    @Override
    public Company getObj(int i) {
        if (listaCompanias[0] != null) {
            if (i >= 1 && i <= listaCompanias.length) {
                if (listaCompanias[i] != null) {
                    return listaCompanias[i];
                }
            } else {
                JOptionPane.showMessageDialog(null, "Introduce una opción valida", "Error de opción", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro de Compañias vacio", "Registro Vacio", 1);

        }
        return null;
    }

    @Override
    public Company getObj(String id) {
        if (listaCompanias[0] != null) {

            for (int i = 0; i < listaCompanias.length && listaCompanias[i] != null; i++) {
                if (listaCompanias[i].getNombre().equals(id)) {

                    return listaCompanias[i];
                }
            }
            //JOptionPane.showMessageDialog(null, id, id, numVuelosProximos);
        }
        return null;
    }


/*
 Get y Set
 */
public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Company[] getListaCompanias() {
        return listaCompanias;
    }

    public void setListaCompanias(Company[] listaCompanias) {
        this.listaCompanias = listaCompanias;
    }

    public int getNumCompania() {
        return numCompania;
    }

    public void setNumCompania(int numCompania) {
        this.numCompania = numCompania;
    }

    @Override
        public String toString() {
        return "Aeropuerto: " + nombre + "\nCiudad: " + ciudad + "\nPaís: " + pais + "\nCompañias que operan: " + Metodos.mostrarArreglo(listaCompanias) + "\nNumero de Compañias: " + numCompania;
    }

}
