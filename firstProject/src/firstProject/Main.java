package firstProject;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para calcular 10%");
		int a = 0;
		System.out.println("Informe o valor de a: ");
		a = sc.nextInt();
		int b = 0;
		System.out.println("Informe o valor de b: ");
		b = sc.nextInt();
		int c = 0;
		System.out.println("Informe o valor de c: ");
		c = sc.nextInt();
		double delta =  Math.pow(2,b) - 4 * a * c;
		
		if (delta > 0) {
			var xPos = (-b + Math.sqrt(delta))/2 * a;
			var xNeg = (-b - Math.sqrt(delta))/2 * a;
			System.out.println("O valor x positivo é: " + xPos);
			System.out.println("O valor x negativo é: " + xNeg);
		} else {
			System.out.println("A função não contem raiz real!");
		}
				
		sc.close();
	}
	
}
