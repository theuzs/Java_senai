package aplicacao;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
	
		method1();
		System.out.println("Fim do Programa!");

	}
	
	public static void method1() {
		System.out.println("**METHOD1 START**");
		method2();
		System.out.println("**METHOD1 END**");
	}
	
	public static void method2() {
		System.out.println("**METHOD2 START**");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Inválida!");
			e.printStackTrace();
			sc.next();
		}
		
		catch (AnnotationTypeMismatchException e) {
			System.out.println("Erro de Entrada");
		}
			
			sc.close();
			System.out.println("**METHOD2 END**");
		}

}