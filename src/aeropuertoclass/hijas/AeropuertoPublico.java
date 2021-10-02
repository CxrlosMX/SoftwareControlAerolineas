/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertoclass.hijas;

import aeropuertoclass.Aeropuerto;
import companiaclass.Company;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 02-oct-2021
 *
 */
public class AeropuertoPublico extends Aeropuerto {
    //Saldo o credito que le proporciona el gobierno al aeropuerjto
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais, Company[] listaCompanias) {
        super(nombre, ciudad, pais, listaCompanias);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(double subvencion) {
        this.subvencion = subvencion;
    }

    @Override
    public String toString() {
        return "Subvención: " + subvencion;
    }

}
