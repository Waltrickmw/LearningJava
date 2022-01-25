// Lendo 2 variáveis e somando-as. 

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int va = leitor.nextInt();
        int vb = leitor.nextInt();
        
        int total = va + vb;
        
        System.out.println("X = " + total);
    }
}