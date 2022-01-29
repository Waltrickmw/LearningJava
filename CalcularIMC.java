package cursoLogicaCapitulo2;
import java.util.Scanner;

public class CalcularIMC {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		Double peso = ler.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		Double altura = ler.nextDouble();
		
		Double imc = (peso / (altura * altura));
		
		System.out.printf("Seu IMC é: %.2f", imc);
		
		ler.close();
	}

}
