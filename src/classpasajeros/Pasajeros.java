/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpasajeros;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 24-sep-2021
 *
 */
public class Pasajeros {

    private String nombre;
    private int numeroPasaporte;
    private String nacionalidad;

    public Pasajeros(String nombre, int numeroPasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNumero de Pasaporte: " + numeroPasaporte + "\nNacionalidad: " + nacionalidad ;
    }
    

}
