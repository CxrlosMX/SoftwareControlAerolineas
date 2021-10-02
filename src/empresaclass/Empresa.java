/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaclass;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 02-oct-2021
 *
 */
public class Empresa {

    private String nombreEmpresa;
    private int numSocio;

    public Empresa(String nombreEmpresa, int numSocio) {
        this.nombreEmpresa = nombreEmpresa;
        this.numSocio = numSocio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    @Override
    public String toString() {
        return "Nombre Empresa: " + nombreEmpresa + "\nNumero de Socio: " + numSocio;
    }

}
