package primerProyecto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
		/* Perro juancito = new Perro();
        Scanner entrada = new Scanner(System.in);
        System.out.print ("ingrese su edad");
        int edad=entrada.nextInt();
        System.out.print ("la edad ingresada es: "+ edad);
        juancito.darNombreAlPerro("Juancito el perro");
        //System.out.print("el nombre del perro es: "+juancito.getNombre());
    }*/
		Scanner entrada = new Scanner(System.in);
        System.out.print ("ingrese un numero: ");
        int numero1 =entrada.nextInt();
        System.out.print ("ingrese otro numero: ");
        int numero2 =entrada.nextInt();
        
		Calculadora calculadora = new Calculadora ();
	System.out.println	("el resultado de la suma es: " + calculadora.suma(numero1,numero2 ) ); 
	}
}

