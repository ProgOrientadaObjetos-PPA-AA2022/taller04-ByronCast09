/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

/**
 *
 * @author USUARIO 2020
 */
public class Automovil {
    String cedula_d;
    String marca;
    int ano_f;
    double valor;
    double valor_matricula;
    
    public Automovil(String cedulas){
        cedula_d = cedulas;
    }
    
    public Automovil(String cedulas,String marcas,int amo_f,double valore,double valor_matriculae){
        cedula_d = cedulas;
        marca = marcas;
        ano_f = amo_f;
        valor = valore;
        valor_matricula = valor_matriculae;
    }
    
    public void establecerCedula(String c){
        cedula_d = c;
    }
    
    public void establecerMarca(String c){
        marca= c;
    }
    
    public void establecerAnofab(int c){
        ano_f= c;
    }
    
    public void establecerValorV(double c){
        valor = c;
    }
    
    public void calcularValorMat(double c){
        valor_matricula= (valor * 0.002)*(2022 - ano_f);
    }
    
    public String obtenerCedula(){
        return cedula_d;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public int obtenerAnofab(){
        return ano_f;
    }
    
    public double obtenerValorV(){
        return valor;
    }
    
    public double obtenerValorMat(){
        return valor_matricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Cédula del dueño: %s\n"
            + "La Marca del vehículo es: %s\n"
            + "Año de Fabricación: %d\n"
            + "Valor de vehículo: %.2f\n"
            + "Valor de la matricula: %.2f\n",cedula_d,marca,ano_f,valor,valor_matricula);
        return cadena;
    }
}
