/*************************************************************************************************************
Persona.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Laboratorio No. 1 Simulador de Perrera 
Clase Persona que define su confiabilidad y comportamiento 
*************************************************************************************************************/
import java.util.Random; //Librerías
public class Persona{ //Clase Persona
    //Instancia de Variables
	Random rand;
	rand = new Random();
    boolean Galleta;
	float confiabilidad = rand.nextFloat() * -10;
    Galleta = false;
	//Métodos
	if (confiabilidad < 6){
		System.out.println("Persona acaricia al perro");
	}
	else if (confiabilidad > 5){
		System.out.println("Persona le da una galleta al perro");
	}
	
    public getGalleta(){
        Galleta = false;
    }
	public void setGalleta(){
        Galleta = true;
    }

	
}
