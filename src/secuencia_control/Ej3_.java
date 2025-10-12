package secuencia_control;

import java.util.ArrayList;
import java.util.List;

public class Ej3_ {
	
	public static int suma_multiplos() {
		
		List<Integer>multiplos=new ArrayList<>();
		int suma=0;
		
		for(int i=1;i<=100;i++) {
			
			if(i%5==0) {
				suma+=i;
				multiplos.add(i);
			}
			
		}
		
		for(int l:multiplos) {
			
			System.out.println(l);
		}
		
		return suma;
		
	}
	
}

class Ej3prueba{
	
	public static void main(String[] args) {
		
		System.out.println(Ej3_.suma_multiplos());
		
	}
	
	
}
