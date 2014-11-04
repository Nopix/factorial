import java.util.Scanner;

public class Factorial {
	public static double factorial(double numero) {
		if (numero == 0) {
			return 1;
		} else {
			double resultat = numero * factorial(numero - 1);
			return resultat;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un valor entre 0 y 170: ");
		int num = scan.nextInt();
		if (num < 0 || num > 170) {
			System.out.println("El número introducido tiene que ser entre 0 y 170");
		} else {
			System.out.println(factorial(num));
		}
		scan.close();
	}
}