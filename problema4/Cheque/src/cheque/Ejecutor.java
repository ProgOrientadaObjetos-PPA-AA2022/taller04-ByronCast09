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
public class Ejecutor {
    public static void main(String[] args){
        Cheque ch1 = new Cheque("Byron Castillo");
        Cheque ch2 = new Cheque("Angela Moncayo");
        
        ch1.establecerNombreb("Blanco de Loja");
        ch1.establecerValorcheque(506.50);
        ch1.calcularComision();
        System.out.printf("%s\n",ch1);
        
        ch2.establecerNombreb("Banco de la Jepp");
        ch2.establecerValorcheque(698.15);
        ch2.calcularComision();
        System.out.printf("%s\n",ch2);
    }
}
