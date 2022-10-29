public class Primeiro {
	//Classes Wrapper
	//int		= Integer
	//float		= Float
	//boolean	= Boolean
	//			= String
	public static void main(String [] args) {
		
		String nome = args[0];
		
		String sobrenome = args[1];
		
		int idade = Integer.valueOf(args[2]);
	
		// Utilizando o parâmetro args para passagem de valor para idade
		// System.out.println(nome + " " + sobrenome + " " + args[2]);	
		
		// Utilzando a variavel idade diretamente
		// Alterado
		System.out.println(nome + " " + sobrenome + " " + idade);		
	}
}