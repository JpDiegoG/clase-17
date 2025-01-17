/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Laboratorios DCCO
 */
public class OperacionesControlador {
    public int sumar(int n1,int n2){
        return n1+ n2;
    }
    
      public int dividir(int n1,int n2){
         if(n2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
             }
        return n1/ n2;
}
      public int restar(int n1,int n2){
        return n1- n2;
}
      public int multiplicar(int n1,int n2){
        return n1* n2;
}
      }