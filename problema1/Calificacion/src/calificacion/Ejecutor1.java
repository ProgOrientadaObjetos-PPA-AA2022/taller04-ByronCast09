/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calificacion;

/**
 *
 * @author SALA I
 */
public class Ejecutor1 {
    public static void main(String[] args){
        Calificacion cl = new Calificacion("Byron");
        Calificacion cl2 = new Calificacion("Angela");
        
        cl.establecerCalf1(6.76);
        cl.establecerCalf_2(8.90);
        cl.establecerCalf_3(9.34);
        cl.calcularProm();
        System.out.printf("%s\n",cl);
        
        cl2.establecerCalf1(8.43);
        cl2.establecerCalf_2(8.30);
        cl2.establecerCalf_3(10);
        cl2.calcularProm();
        System.out.printf("%s\n",cl2);
        
    }
}
