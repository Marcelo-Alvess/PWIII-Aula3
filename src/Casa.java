
class Casa {
	public static void main(String[] args) {
		double largura = 20;
		double altura = 20;
		double custo = 60;
		
		System.out.println("resultado: "+ total(largura, altura, custo));
	}
	
	public static double area(double largura, double altura) {
		return (largura * altura) * 0.5;
	}
	
	public static double total(double largura, double altura, double custo) {
		return area(largura, altura) * custo;
	}
}
