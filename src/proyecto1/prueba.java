package proyecto1;


import java.util.Scanner;

public class prueba {
	

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	System.out.println("ingrese un numero  ");
	
	int num = input.nextInt();
	
	
  if ( num < 0 ){
	  
	  System.out.println ( " el numero es menor a cero ");
	  
	  
  } else {
	  
	  System.out.println ( " el numero es mayor  a cero ");
	  
	  
	  
  }
	
	}

}
