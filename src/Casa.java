
public class Casa {
	public static void main(String[] args) {
		double larguraC = 20;
		double alturaC = 20;
		double custoC = 60;
		
		System.out.println("resultado: "+ total(larguraC, alturaC, custoC));
	}
	
	public static double area(double larguraC, double alturaC) {
		return larguraC * alturaC * 0.5;
	}
	
	public static double total(double larguraC, double alturaC, double custoC) {
		return area(larguraC, alturaC) * custoC;
	}
}
