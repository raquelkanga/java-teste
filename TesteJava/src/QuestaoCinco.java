
public class QuestaoCinco {
	public static void main(String[] args) {
		double p1 = 8.5/2;
		double p2 = 5.0/3;
		double p3 = 9.2/5;
		double mediaFinal = p1 + p2 + p3;
		
		if (mediaFinal>=7) {
			
			System.out.printf("Parab�ns! Voc� est� aprovado! Sua m�dia final foi: %.1f", mediaFinal);
			
		}else if(mediaFinal<=7) {
			
			System.out.printf("Voc� est� de recupera��o. Sua m�dia final foi: %.1f", mediaFinal);
			
		}
	}
}
