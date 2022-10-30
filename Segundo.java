import java.util.Scanner;

public class Segundo {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		String nome = in.next();
		
		int idade = in.nextInt();
		
		float salario = in.nextFloat();
		
		System.out.println(nome + " - " + idade + " - " + salario);
		int a = 0;
		do {
			System.out.println(args[a]);			
			a++;
		} while (a < args.length);
		
		in.close();
	}
}