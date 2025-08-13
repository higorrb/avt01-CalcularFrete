package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("O Frete do seu produto: " + CalcularFrete(50,2));
    }


    public static double CalcularFrete(double subtotal, double distancia){
        double frete = 0.0;
        if (subtotal >= 100){
            frete = 0;
        }
        else{
            if (distancia <= 3){
                //ERRO PROPOSITAL
                frete = 5.99;
            }
            else if (distancia > 3 && distancia <=6){
                frete = 9.99;
            }
            else if (distancia > 6) {
                frete = 14.99;
            }
        }
        return frete;
    }
}
