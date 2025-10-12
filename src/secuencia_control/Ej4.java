package secuencia_control;

public class Ej4 {

	public static void min_max(int[]lista) {
		
		int min=Integer.MAX_VALUE;
		int max=0;
		
		for(int i=0; i<lista.length;i++) {
				
			if(lista[i]<min) {
					
					min=lista[i];
					
				}
				
			if(lista[i]>max) {
					
					max=lista[i];
					
				}
			
			if(lista[i]<0) break;
			
		}
		
		System.out.println(min);
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []milista= {2,1,1,3,4,10,6};
		
		Ej4.min_max(milista);
	}

}
