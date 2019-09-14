
public class QuestaoCinco {
	public static void main(String[] args) {
		double p1 = 8.5/2;
		double p2 = 5.0/3;
		double p3 = 9.2/5;
		double mediaFinal = p1 + p2 + p3;
		
		if (mediaFinal>=7) {
			
			System.out.printf("Parabéns! Você está aprovado! Sua média final foi: %.1f", mediaFinal);
			
		}else if(mediaFinal<=7) {
			
			System.out.printf("Você está de recuperação. Sua média final foi: %.1f", mediaFinal);
			
		}
	}
}
