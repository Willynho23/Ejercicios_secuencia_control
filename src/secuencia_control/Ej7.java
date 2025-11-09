package secuencia_control;

import java.util.ArrayList;
import java.util.List;

public class Ej7 {
		
	public static void descomposicion(int r) {
		
		
		List<Integer>descom=new ArrayList<>();
		int num=r;
		
		for(int i=2; i<100000;i++) {
			
			int primo_cazado=i;
			
			for(int j=2; j<i;j++) {
				
				if(i%j==0) {
					
					primo_cazado=0;
					break;
					
				}
			}
			
			if(primo_cazado>0) {
				
				while(num%primo_cazado==0) {
					
					descom.add(primo_cazado);
					num=num/primo_cazado;
					
				}
				
			}
			
		}
		
		String resultado= r+" = ";
		for(int l=0;l<descom.size();l++) {
			
			if(l==descom.size()-1) {
				resultado=resultado+descom.get(l);
			}
			
			else {
				resultado=resultado+descom.get(l)+" x ";
			}
			
		}
		
		System.out.println(resultado);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ej7.descomposicion(23965);
		
	}

}
