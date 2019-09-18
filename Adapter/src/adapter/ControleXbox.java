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
public class ControleXbox {
    private SensorXbox sensorAQueSeConecta;
    
    public void Conectar(SensorXbox sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarXbox();
    }
}
