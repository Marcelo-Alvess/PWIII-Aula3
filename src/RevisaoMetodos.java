
public class RevisaoMetodos {
	public static void main(String[] args) {
		int valorProx = 2;
		System.out.println("Próximo number: "+ proximo(valorProx));
		
		System.out.println("Resultado dobro: "+ dobroProximo(valorProx));
	}
	
	public static int proximo(int valorProx) {
		 return valorProx + 1;
	}
	
	public static int dobroProximo(int valorProx) {
		return proximo(valorProx) * 2;
	}

}
