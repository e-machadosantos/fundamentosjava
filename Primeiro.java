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
			
			String situacao;
			if(idade < 50) {
				situacao = "iniciante";
			} else {
				situacao = "veterano";
			}
			
			String status;
			if(salarioTotal < 100000.0) {
				status = "instavel";
			} else {
				status = "estavel";
			}			
			
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);			
			System.out.println("Salario :" + salario);
			System.out.println("Dev: " + javaDev);
			
			System.out.println("Ano Nascimento: " + anoNascimento);
			System.out.println("Salario Total: " + salarioTotal);
			System.out.println("Situacao: " + situacao);
			System.out.println("Status: " + status);
		} else {
			System.out.println(nome + " " + "Impossivel exibir o relatorio: " + qtde + "!");			
		}
	}
}