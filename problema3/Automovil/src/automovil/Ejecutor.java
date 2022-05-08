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
public class Ejecutor {
    public static void main(String[] args){
        Automovil aut1 = new Automovil("1105907768");
        Automovil aut2 = new Automovil("1109834672");
        
        aut1.establecerMarca("Chevolet");
        aut1.establecerAnofab(2019);
        aut1.establecerValorV(1965.60);
        aut1.calcularValorMat(0);
        System.out.printf("%s\n",aut1);
        
        aut2.establecerMarca("KIA");
        aut2.establecerAnofab(2022);
        aut2.establecerValorV(2365.50);
        aut2.calcularValorMat(0);
        System.out.printf("%s\n",aut2);
    }
}
