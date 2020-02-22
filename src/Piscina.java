
public class Piscina {
	public static void main(String[] args) {
		double diametro = 6;
		double custo = 75;
		System.out.println("Valor Total: "+ total(diametro, custo));
	}
	
	public static double raio(double diametro) {
		return diametro / 2;
	}
	
	public static double area(double diametro) {
		return Math.PI * Math.pow(raio(diametro), 2);
	}
	
	public static double total(double diametro, double custo) {
		return area(diametro) * custo;
	}
}
