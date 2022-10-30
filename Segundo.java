public class Segundo {
	public static void main(String [] args) {
		
		// usanto Do While
		
		// inicializacao
		// do {
		//		incremento	
		// }while(condicao);
				
		int a = 0;
		do {
			System.out.println(args[a]);			
			a++;
		} while (a < args.length);
	}
}