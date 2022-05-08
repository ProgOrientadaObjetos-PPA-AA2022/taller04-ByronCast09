/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesor;

/**
 *
 * @author USUARIO 2020
 */
public class Profesor {
    private String nombrep;
    private String apellidop;
    private double sueldobas;
    private double sueldotot;
    private String cedula;
    
    public Profesor(String nombreProfesor){
        nombrep = nombreProfesor;
    }
    
    public Profesor(String nombreProfesor,String apellidoProfe,double sueldoBasico,
            double sueldoTotal, String cedulaP){
        nombrep = nombreProfesor;
        apellidop = apellidoProfe;
        sueldobas = sueldoBasico;
        sueldotot = sueldoTotal;
        cedula = cedulaP;
    }
    
    public void establecerNombre(String c){
        nombrep = c;
    }
    
    public void establecerApellido(String c){
        apellidop = c;
    }
    
    public void establecerSueldoB(double c){
        sueldobas = c;
    }
    
    public void calcularSueldoTot(){
        sueldotot = sueldobas + (sueldobas * 20)/100;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public String obtenerNombre(){
        return nombrep;
    }
    
    public String obtenerApellido(){
        return apellidop;
    }
    
    public double obtenerSueldoB(){
        return sueldobas;
    }
    
    public double obtenerSueldoTot(){
        return sueldotot;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Docente: %s\n"
            +"Apellido del Docente: %s\n"
            + "Su sueldo básico es: %.2f\n"
            + "Su sueldo Total es: %.2f\n"
            + "Su cédula es: %s\n",nombrep,apellidop,sueldobas,sueldotot,cedula);
        return cadena;
    }
}
