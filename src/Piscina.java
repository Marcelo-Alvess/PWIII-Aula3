
public class Piscina {
	public static void main(String[] args) {
		double diametroP = 6;
		double custoP = 75;
		
		System.out.println("Valor Total: "+ total(diametroP, custoP));
	}
	
	public static double raio(double diametroP) {
		return diametroP / 2;
	}
	
	public static double area(double diametroP) {
		return Math.PI * Math.pow(raio(diametroP), 2);
	}
	
	public static double total(double diametroP, double custoP) {
		return area(diametroP) * custoP;
	}
}
