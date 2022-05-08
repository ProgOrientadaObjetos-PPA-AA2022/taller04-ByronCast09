/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheque;

/**
 *
 * @author USUARIO 2020
 */
public class Cheque {
    String nombrec;
    String nombreB;
    double valor_che;
    double comision;
    
    public Cheque(String nombrecheque){
        nombrec = nombrecheque;
    }
    
    public Cheque(String nombrecheque,String nombreBanco,double valorcheq,double comisiones){
        nombrec = nombrecheque;
        nombreB = nombreBanco;
        valor_che = valorcheq;
        comision = comisiones;
    }
    
    public void establecerNombre_cli(String c){
        nombrec= c;
    }
    
    public void establecerNombreb(String c){
        nombreB = c;
    }
    
    public void establecerValorcheque(double c){
        valor_che = c;
    }
    
    public void calcularComision(){
        comision = valor_che * 0.003;
    }
    
    public String obtenerNombre_cli(){
        return nombrec;
    }
    
    public String obtenerNombreb(){
        return nombreB;
    }
    
    public double obtenerValorcheque(){
        return valor_che;
    }
    
    public double obtenerComision(){
        return comision;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Cliente: %s\n"
            + "Nombre del Banco: %s\n"
            + "Valor del Cheque: %.2f\n"
            + "Comision del Banco: %.2f\n",nombrec,nombreB,valor_che,comision);
        return cadena;
    }
}
