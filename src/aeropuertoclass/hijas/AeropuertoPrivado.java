/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertoclass.hijas;

import aeropuertoclass.Aeropuerto;
import companiaclass.Company;
import empresaclass.Empresa;
import javax.swing.JOptionPane;
import metodos.MetodosGenericos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 02-oct-2021
 *
 */
public class AeropuertoPrivado extends Aeropuerto {

    private Empresa[] listaEmpresas;
    private int numEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        listaEmpresas = new Empresa[3];
        numEmpresas = 0;
    }

    public AeropuertoPrivado(Empresa[] listaEmpresas, String nombre, String ciudad, String pais, Company[] listaCompanias) {
        super(nombre, ciudad, pais, listaCompanias);
        this.listaEmpresas = listaEmpresas;
        this.numEmpresas = listaEmpresas.length;
    }
    /*
     Método que nos permite agregar empresas
     */

    public void agregarEmpresas() {
        if (listaEmpresas[listaEmpresas.length - 1] == null) {
            boolean seguir = false;
            Object desicion[] = {"SI", "NO"};
            do {
                if (listaEmpresas[listaEmpresas.length - 1] == null) {
                    Empresa e = dameEmpresa();
                    addEmpresa(e);
                } else {
                    JOptionPane.showMessageDialog(null, "Registro de Empresas lleno", "Regisntro Lleno", 2);
                    break;
                }
                int x = JOptionPane.showOptionDialog(null, "Desea seguir agregando empresas", "Agregando", JOptionPane.DEFAULT_OPTION, 1, null, desicion, null);
                if (x == 1) {
                    seguir = true;
                }
            } while (!seguir);
        } else {
            JOptionPane.showMessageDialog(null, "Registro de Empresas lleno", "Regisntro Lleno", 2);
        }
    }
    /*
     Método que nos devuelve un objeto de la clase Empresa
     */

    private Empresa dameEmpresa() {
        String nombreEmpresa = JOptionPane.showInputDialog(null, "Introduce el nombre de la Empresa", "Introduciendo Nombre", 1);
        int numS = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de socios de la empresa", "Socios", 1));
        return new Empresa(nombreEmpresa, numS);
    }

    public void addEmpresa(Empresa objeto) {
        if (listaEmpresas[listaEmpresas.length - 1] == null) {
            boolean encontrado = false;
            for (int i = 0; i < listaEmpresas.length && !encontrado; i++) {
                if (listaEmpresas[i] == null) {
                    listaEmpresas[i] = objeto;
                    numEmpresas++;
                    JOptionPane.showMessageDialog(null, "Vuelo Registrado con Exito", "Registrado con exito", 1);
                    encontrado = true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es posible agregar màs vuelo", "Registro lleno", 2);
        }
    }

    public Empresa[] getListaEmpresas() {
        return listaEmpresas;
    }

    public Empresa serchEmpresa(String nombreEmpresa) {
        if (listaEmpresas[0] != null) {

            for (int i = 0; i < listaEmpresas.length && listaEmpresas[i] != null; i++) {
                if (listaEmpresas[i].getNombreEmpresa().equalsIgnoreCase(nombreEmpresa)) {
                    return listaEmpresas[i];
                }
            }
        }
        return null;
    }

}
