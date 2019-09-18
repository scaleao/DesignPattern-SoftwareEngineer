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
public class AdaptadorXboxParaPS5 extends SensorXbox{
    public SensorPS5 adaptee;

    public AdaptadorXboxParaPS5(SensorPS5 adaptee) {
        this.adaptee = adaptee;
    }

    //Override da solicitação
    @Override
    public void conectarXbox() {
        adaptee.conectarPS5();
        System.out.println("Controle Xbox adaptado");
    }
}
