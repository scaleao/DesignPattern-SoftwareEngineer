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
public abstract class User {
    protected String nome;
    
    public User(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void getMensagem(){
        System.out.println("Bem vindo!" + getNome());
    }
}
