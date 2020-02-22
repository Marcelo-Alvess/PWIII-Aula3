
public class Construcao {
	public static void main(String[] args) {
		double larguraC = 20;
		double alturaC = 20;
		double custoC = 60;
		double diametroP = 6;
		double custoP = 75;
		
		double custoCasa = Casa.total(larguraC, alturaC, custoC);
		double custoPiscina = Piscina.total(diametroP, custoP);
		
		System.out.println("Resultado: "+ String.format("\nCusto Total da Casa: R$%.2f\nCusto Total da Piscina: R$%.2f\nCusto Total: R$%.2f", custoCasa, custoPiscina, totalConstrucao(custoCasa, custoPiscina)));
	}
	
	public static double totalConstrucao(double custoCasa, double custoPiscina) {
		return custoCasa + custoPiscina;
	}
}
