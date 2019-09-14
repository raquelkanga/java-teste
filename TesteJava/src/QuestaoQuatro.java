
public class QuestaoQuatro {

	public static void main(String[] args) {
		int horaMensal = 180;
		int horaExtra= ((180-160)*50)/100;
		double salarioHora = 8.00;
		double salario= (salarioHora*horaMensal) + horaExtra;
		
	      if(horaMensal>160) {
		      System.out.printf(" O salário de Felipe este mês foi de %.2f",salario);
	    }
	  }

}
