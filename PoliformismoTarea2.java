/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismotarea2;

/**
 *
 * @author windows
 */
class CalculosBateria{
    int CalcularVoltaje(int resistenciaBat, int corrienteBat){
        return resistenciaBat*corrienteBat;
    }
    double CalcularVoltaje(double resistenciaBat, double corrienteBat){
        return resistenciaBat*corrienteBat;
    }
    
    int CalcularCorriente(int resistenciaBat, int voltajeBat){
        return voltajeBat/resistenciaBat;
    }
    
    double CalcularCorriente( double resistenciaBat, double voltajeBat){
        return voltajeBat/resistenciaBat;
    }   
}
public class PoliformismoTarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculosBateria voltaje1=new CalculosBateria();
        CalculosBateria voltaje2=new CalculosBateria();
        
        CalculosBateria corriente1=new CalculosBateria();
        CalculosBateria corriente2=new CalculosBateria();
        
        System.out.println("       UNIVERISIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("NRC: 7450");
        System.out.println("Carrea: Ingenieria Automotriz");
        System.out.println("------------------------------------\n");
        System.out.println(" Poliformismo (Sobrecarga de Metodos) \n"); 
        //Claculo Voltaje
        int resultado1;
        voltaje1.CalcularVoltaje(2,5);
        resultado1=voltaje1.CalcularVoltaje(2,5);
        System.out.println("-El Voltaje de la bateria 1 es: "+resultado1);
        
        double resultado2;
        voltaje2.CalcularVoltaje(2.5,4.9);
        resultado2=voltaje1.CalcularVoltaje(2.5,4.9);
        System.out.println("-El Voltaje de la bateria 2 es: "+resultado2);
        
        //Claculo Corriente
        int resultado3;
        corriente1.CalcularCorriente(9,12);
        resultado3=corriente1.CalcularCorriente(9,12);
        System.out.println("-La Corriente de la bateria 1 es: "+resultado3);
        
        double resultado4;
        corriente2.CalcularCorriente(10.3,11.45);
        resultado4=voltaje1.CalcularCorriente(10.3,11.45);
        System.out.println("-La Corriente de la bateria 2 es: "+resultado4);
        
    }
    
}
