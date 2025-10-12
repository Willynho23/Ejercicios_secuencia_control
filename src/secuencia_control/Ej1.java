package secuencia_control;

public class Ej1 {
	public static void main(String[]args) {
		
		int dias_año=365;
		int horas_dia=24;
		int minutos_hora=60;
		int segundos_minuto=60;
		
		int segundos_año=segundos_minuto*minutos_hora*horas_dia*dias_año;
		System.out.println(segundos_año);
	}
}
