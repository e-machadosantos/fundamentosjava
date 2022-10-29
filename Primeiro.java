public class Primeiro {
	//Classes Wrapper
	//int		= Integer
	//float		= Float
	//boolean	= Boolean
	//			= String
	public static void main(String [] args) {
		
		int qtde = args.length;

		String nome = "Sr,";
		
		if(qtde == 6) {
			nome = args[0];		
			String sobrenome = args[1];		
			int idade = Integer.valueOf(args[2]);		
			float salario = Float.valueOf(args[3]);		
			boolean javaDev = Boolean.valueOf(args[4]);
			int meses = Integer.valueOf(args[5]);
			
			int anoNascimento = 2022 - idade;
			float salarioTotal = salario * meses;
			
			
			System.out.println(nome);
			System.out.println(sobrenome);			
			System.out.println(salario);
			System.out.println(javaDev);
			
			System.out.println(anoNascimento);
			System.out.println(salarioTotal);			
		} else {
			System.out.println(nome + " " + "Impossivel exibir o relatorio: " + qtde + "!");			
		}
	}
}