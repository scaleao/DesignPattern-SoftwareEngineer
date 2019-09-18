/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templetemethod;

/**
 *
 * @author jscal
 */
public class Teste {
    public static void main(String[] args) {
        String nome = "Joao";
        User usuario = new Administrador(nome);
        usuario.getMensagem();
        System.out.println(usuario.getClass());
    }
    
}
