public class Primeiro {
	//Classes Wrapper
	//int		= Integer
	//float		= Float
	//boolean	= Boolean
	//			= String
	
	private static boolean validar(int quantidade) {
			return quantidade == 6;
		}		
	
	private static int calcularAnoNascimento(int aIdade) {
		
		return 2022 - aIdade;
	}
	
	private static float calcularSalarioTotal(float oSalario, int osMeses) {
		
		return oSalario * osMeses;
	}
	
	private static String obterSituacao(int aIdade) {
		
		return aIdade < 50 ? "iniciante" : "veterano";
	}
	
	public static void main(String [] args) {		
		
		int qtde = args.length;

		String nome = "Sr,";
		
		boolean validado = validar(qtde);
		
		if(validado) {
			nome = args[0];		
			String sobrenome = args[1];		
			int idade = Integer.valueOf(args[2]);		
			float salario = Float.valueOf(args[3]);		
			boolean javaDev = Boolean.valueOf(args[4]);
			int meses = Integer.valueOf(args[5]);
			
			int anoNascimento = calcularAnoNascimento(idade);
			float salarioTotal = calcularSalarioTotal(salario, meses);
			
			String situacao = obterSituacao(idade);			
			String status = "instavel";
			if(salarioTotal > 100000.0) {
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