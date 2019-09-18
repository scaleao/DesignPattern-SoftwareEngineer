/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author jscal
 */
public class Usuario {
    public static void main(String[] args) {
        SensorPS5 adaptee = new SensorPS5();
        ControleXbox target = new ControleXbox();
        AdaptadorXboxParaPS5 adapter = new AdaptadorXboxParaPS5(adaptee);
        target.Conectar(adapter);
    }
}
