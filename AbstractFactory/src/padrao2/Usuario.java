/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao2;

/**
 *
 * @author jscal
 */
public class Usuario {
    public static void main(String args[]) {
        ComponenteFabrica factory = new ComponenteFabrica();
        String nomePlataform = "M";
        factory.getPlataform(nomePlataform);
    }
}
