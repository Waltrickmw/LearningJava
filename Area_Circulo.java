// Calculando área do círculo


import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner ler = new Scanner(System.in);
        double raio = ler.nextDouble();
        double n = 3.14159;
        
        double calcRaio = Math.pow(raio, 2);
        double calcArea = calcRaio * n;
    
    
        System.out.printf("A=%.4f\n", calcArea); 
 
    }
 
}