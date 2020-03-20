package proyecto1;

import java.util.Scanner;

public class osmolaridad {
	
	
	
	
	public static void main(String[] args) {

		

		Scanner in = new Scanner(System.in);
		
		System.out.println("");

		System.out.println(" INGRESE EL VALOR DEL SODIO : ");
		int na = in.nextInt();

		System.out.println(" INGRESE EL VALOR DE LA GLICEMIA : ");
		double gluc = in.nextDouble();

		System.out.println(" INGRESE EL VALOR DE LA UREA  : ");
		double bun = in.nextDouble();

       	double constante = 186/100;
       	
     
	
		double osmo1 = gluc/180;
		
		double osmo2 = bun/60; 
		
		double osmo3=(osmo1+osmo2)*1000;
		

		double osmo4 = na*constante;
		
		
	


double osmo = osmo3 + osmo4;

int osmolaridad = (int)osmo;


		System.out.println("");
		System.out.println(" LA OSMOLARIDAD ES : "+ osmo);
		
		System.out.println("");
		System.out.println(" VALOR APROXIMADO SIN COMAS : "+osmolaridad);
		
	}



}


	
	
	
	
	
	
	


