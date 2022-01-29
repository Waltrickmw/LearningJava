package cursoLogicaCapitulo2;
import java.util.Scanner;



public class CalcularValorTroco {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = ler.nextDouble();
		
		System.out.println("Digite o valor passado pelo cliente: ");
		Double valorPassadoPeloCliente = ler.nextDouble();
		
		Double resultado = valorProduto - valorPassadoPeloCliente;
		
		System.out.printf("Troco: R$ %.2f", resultado);
		
		ler.close();
	}

}
