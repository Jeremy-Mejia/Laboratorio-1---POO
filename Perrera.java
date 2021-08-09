/************************************************************************************************************
SimuladorPerrera.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Laboratorio No. 1 Simulador de Perrera 
Driver program que implementa el menú de opciones para
el simulador que entrenará voluntarios
*************************************************************************************************************/
import java.util.Scanner; //Librerías
class SimuladorPerrera{ //Clase Main (Simulador de Perrera)
	public static void main(String[] args){
		
        //Instancia de Variables
		Perro perro_perrera;
		perro_perrera = new Perro();
		
		Persona persona_voluntario;
		persona_voluntario = new Persona();
		
		Scanner scan = new Scanner (System.in);
		int opcion = 0;
		//Métodos
		while (opcion !=5){
			System.out.println("\n\n Bienvenido al simulador de entrenamiento de voluntarios. ¿Qué harás?");
			System.out.println("1. Nueva Persona");
			System.out.println("2. Nuevo Perro");
			System.out.println("3. Sacar Galleta");
			System.out.println("4. Interactuar");
			System.out.println("5. Salir\n\n");
			
			opcion = scan.nextInt();
			
			if (opcion == 1){
                System.out.println(persona_voluntario + "Nuevo Voluntario");
            }
			else if (opcion == 2){
                System.out.println(perro_perrera  + "Perro Nuevo");
			}
			else if (opcion == 3){
			}
			else if (opcion == 4){
			}
			else if (opcion == 5){
				System.out.println("Gracias por utilizar el simulador");     				}
		    }
	}
}