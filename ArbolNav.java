
package arbolNavDos;

import java.util.Scanner;

public class ArbolNav {

	public static void main(String[] args) {
		
		Scanner numeroArbolito = new Scanner(System.in);
		
		
		System.out.println("De que altura quiere el arbol?");
		int cantidadAltura = numeroArbolito.nextInt();
		
		
		follageArbol(cantidadAltura);
		troncoArbol(cantidadAltura);
		baseArbol(cantidadAltura);
		
		
		numeroArbolito.close();
	}

	 
	 static void follageArbol(int cantidadAltura) {
		
		for(int fila = 0; fila < cantidadAltura; fila++) {
				
				for(int espacios= 0; espacios < (cantidadAltura-fila-1);espacios++){
					System.out.print(" ");
				}
				
				for(int asteriscos=0; asteriscos < (fila*2)+1; asteriscos++) {
					System.out.print("*");
				}
			
				System.out.println("");
			}
	 	}
		
	 static void troncoArbol(int cantidadAltura) {
	 	for (int tronco = 0; tronco < ((cantidadAltura/2));tronco++) {
				
				for(int espacios = 0; espacios < (cantidadAltura/2); espacios++) {
					System.out.print(" ");
				}
				for(int asterisco = 0; asterisco<(((cantidadAltura/2)-1)*2)+1;asterisco++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	
	 static void baseArbol(int cantidadAltura) {
		for(int base = 0; base < (cantidadAltura/2-1); base++) {
				
				for(int asteriscos = 0; asteriscos<((cantidadAltura-1)*2)+1; asteriscos++) {
					System.out.print("*");
				}
				System.out.println("");
			}
	 	}
}