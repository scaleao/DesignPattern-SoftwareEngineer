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
public class ComponenteFabrica {
    public Plataforma getPlataform(String nomePlataform) {
        if(nomePlataform.equals("M")){            
            return new Mobile(nomePlataform);
        }
        if(nomePlataform.equals("T")){
            return new Tablet(nomePlataform);
        }
        else{
            return null;
        }
    }
}
