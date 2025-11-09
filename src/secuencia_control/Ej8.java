package secuencia_control;

import java.util.Scanner;

public class Ej8 {

	public static int prod_escalar(int[] vec1, int[] vec2) {
		
		if(vec1.length!=3 || vec2.length!=3) {
			System.out.println("Por favor, introduzca un vector tridimensional");
			return 0;
		}
		
		int prod=0;
		
		for(int i=0;i<3;i++) {
			
			prod+=vec1[i]*vec2[i];
			
		}
		
		return prod;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int[]vec1= new int [3];
		int[]vec2= new int[3];
		
		System.out.println("Por favor, introduzca el primer vector");
		
		for(int i=0;i<3;i++) {
			vec1[i]=sc.nextInt();
			
		}
		
		System.out.println("Por favor, introduzca el segundo vector");
		
		for(int j=0;j<3;j++) {
			vec2[j]=sc.nextInt();
			
		}
		
		int resultado=Ej8.prod_escalar(vec1, vec2);
		
		System.out.println(resultado);
		
	}

}
