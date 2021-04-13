/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Jesus Andres
 */
public class CalculadoraComplejos {
    
   
    private float real;
    private float imaginario;

    //Constructores
    public CalculadoraComplejos()
    {
        real=1;
        imaginario=1;
    }
    public CalculadoraComplejos(float real, float imaginario){
    this.real=real;
    this.imaginario=imaginario;}
    //Sets y Gets
    public float getReal(){return real;}
    public void setReal(float real){this.real=real;}
    public float getImaginario(){return imaginario;}
    public void setImaginario(float imaginario){this.imaginario=imaginario;}
    
    //Metodo suma de numeros complejos
    public CalculadoraComplejos sumar(CalculadoraComplejos y)
    {
        CalculadoraComplejos resultado=new CalculadoraComplejos();
        resultado.setReal(this.real+y.getReal());
        resultado.setImaginario(this.imaginario+y.getImaginario());
        return resultado;
    }
    //Metodo para imprimir el numero complejo
    public String toString(){return real+"+"+imaginario+"i";}
    //Calculo de magnitud
    public double obtenerMagnitud(){
    return Math.sqrt(Math.pow(real,2)+Math.pow(imaginario,2));}
    //Calculo de angulo
    public double obtenerAngulo(){
    return Math.atan(imaginario/real);}
    //Metodo para imprimir el numero complejo 
    public String verMag_Ang(){
    return obtenerMagnitud()+"<"+obtenerAngulo();}
public CalculadoraComplejos Producto(CalculadoraComplejos y)
    {
        CalculadoraComplejos resultado=new CalculadoraComplejos();
        resultado.setReal((this.real*y.getReal())-(y.getImaginario()*this.imaginario));
        resultado.setImaginario(this.imaginario*y.getReal()+y.getImaginario()*this.real);
        return resultado;
    }
public CalculadoraComplejos Division(CalculadoraComplejos y)
    {
        CalculadoraComplejos resultado=new CalculadoraComplejos();
        resultado.setReal(((this.real*y.getReal())-(-y.getImaginario()*this.imaginario))/((this.real*y.getReal())-(y.getImaginario()*this.imaginario)));
        resultado.setImaginario((this.imaginario*y.getReal()+y.getImaginario()*this.real)/(this.real*y.getReal())-(y.getImaginario()*this.imaginario));
        return resultado;
    }
}
