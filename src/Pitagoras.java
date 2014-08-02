/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17
 */
public class Pitagoras {
    
    double hipotenusa;
    
public double CalcularHipotenusa (double lado1, double lado2){
    hipotenusa = Math.sqrt(Math.pow (lado1,2)+ Math.pow(lado2,2));
    return hipotenusa;
} 
    
}
