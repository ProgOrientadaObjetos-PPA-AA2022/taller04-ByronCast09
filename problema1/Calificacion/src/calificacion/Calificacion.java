/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacion;

/**
 *
 * @author SALA I
 */
public class Calificacion {
    String nombre_est;
    double calf_1;
    double calf_2;
    double calf_3;
    double prom;
        
    public Calificacion(String nombre){
        nombre_est = nombre;
    }
        
    public Calificacion(String nombre, double calf1, double calf2, double calf3,
        double prom){
        nombre_est = nombre ;
        calf_1 = calf1;
        calf_2 = calf2;
        calf_3 = calf3;
        prom = prom;
    }
        
    public void establecerNombre(String c){
        nombre_est = c;
    }
        
    public void establecerCalf1(double c){
        calf_1 = c;
    }
        
    public void establecerCalf_2(double c){
        calf_2= c;
    }
        
    public void establecerCalf_3(double c){
        calf_3= c;
    }
        
    public void calcularProm(){
        prom = (calf_1 + calf_2 + calf_3) / 3;
    }
        
    public String obtenerNombre(){
        return nombre_est;
    }
        
    public double obtenerCalf1(){
        return calf_1;
    }
        
    public double obtenerCalf2(){
        return calf_2;
    }
        
    public double obtenerCalf3(){
        return calf_3;
    }
        
    public double obtenerProm(){
        return prom;
    }
        
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Estudiante: %s\n"
            + "Calificacion 1: %.2f\n"
            + "Calificacion 2: %.2f\n"
            + "Calificacion 3: %.2f\n"
            + "Promedio: %.2f\n",
            nombre_est,
            calf_1,
            calf_2,
            calf_3,
            prom);       
        return cadena;
    }
}
