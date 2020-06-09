import java.util.Scanner;

public class três {

	public static void main(String[] args) {
Scanner leitor = new Scanner (System.in);
		
		double a,b,c,d;
		
		System.out.println("Descubra se voce foi aprovado! Digite suas 4 notas em sequência:");
		
		a=leitor.nextDouble();
		b=leitor.nextDouble();
		c=leitor.nextDouble();
		d=leitor.nextDouble();
		
		if((a+b+c+d)/4 >=7) {
			
			System.out.println("Sua média é "+(a+b+c+d)/4+" e você foi APROVADO!");
		}
		
		else {
			System.out.println("Sua média é "+(a+b+c+d)/4+" e você foi REPROVADO!");
		}}}