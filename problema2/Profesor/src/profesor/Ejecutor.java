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
public class Ejecutor {
    public static void main(String[] args){
        Profesor pf = new Profesor("Darwin");
        Profesor pf2 = new Profesor("René");
        
        pf.establecerApellido("Santorum");
        pf.establecerSueldoB(456.89);
        pf.calcularSueldoTot();
        pf.establecerCedula("1105907768");
        System.out.printf("%s\n",pf);
        
        pf2.establecerApellido("Elizalde");
        pf2.establecerSueldoB(600.65);
        pf2.calcularSueldoTot();
        pf2.establecerCedula("1197628453");
        System.out.printf("%s\n",pf2);
    }
}
