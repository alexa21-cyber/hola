package semana2;
import java.util.Scanner;
public class Ejemplo2 {

	public static void main(String[] args) {

		//mi primer proyecto
		//System.out.println("Hola a todos");
		
		//instrucciones:escribir
		//System.out.println("yo tengo "+1000+"amigos");
		
		//seguencia de escape
		//System.out.println("Este es un ejemplo \n de \n secuencia de escape");
		
		//tipo String
		//String nombre= "alexa";
		//System.out.println(nombre);
		
		//instrucciones:leer ejemplo1
		//Scanner scan =new Scanner(System.in);
		//System.out.println("Ingrese su nombre");
		//String nombres=scan.next();
		//System.out.println("Usted se llama "+ nombres);
        
		//instrucciones:leer ejemplo2
		Scanner scan = new Scanner (System.in); 
			System.out.println("Ingrese Apellido Paterno");
			String apepat =scan.next();
			System.out.println("Ingrese Apellido Materno");
			String apemat =scan.next();
			System.out.println("Ingrese edad");
			int edad =scan.nextInt();
			System.out.println("Apellidos: "+apepat+" "+apemat+", tiene "+
			edad+" años");

	}

}
