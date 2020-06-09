import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leitor = new Scanner (System.in);
		
		int x,y;
		
		System.out.println("Multiplicação! Digite um número:");
		x=leitor.nextInt();
		
		System.out.println("Multiplicado por:");
		y=leitor.nextInt();
		
		System.out.println("É igual á: "+(x*y));
	}
}