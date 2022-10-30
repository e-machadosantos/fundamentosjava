import java.util.Scanner;

public class Segundo {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = in.next();
		System.out.print("Informe sua idade: ");
		int idade = in.nextInt();
		System.out.print("Informe seu salario: ");
		float salario = in.nextFloat();
		
		System.out.println(nome + " - " + idade + " - " + salario);
		
		in.close();
	}
}