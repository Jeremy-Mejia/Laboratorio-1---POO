/*************************************************************************************************************
Perro.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Laboratorio No. 1 Simulador de Perrera 
Clase Perro que define su ánimo y comportamiento 
*************************************************************************************************************/
import java.util.Random; //Librerías
public class Perro{ //Clase Perro
    //Instancia de Variables
	Random rand;
	rand = new Random();
	float animo = rand.nextFloat() * 10 - 5;
	float umbral = rand.nextFloat()* 20;
	//Métodos
	private void psican(Persona p){
		this.animo = (1.0/p.getConfiabilidad()) * (rand.nextFloat() - 0.5) * 10 + this.animo;
		if (p.tieneGalleta()){
			p.darGalleta();
			this.animo += (1.0 / p.getConfiabilidad()) * (rand.nextInt(2));		
		}
		System.out.println("Mi nuevo ánimo es:" + animo);
    }
	
	if ((animo > 0) && (umbral = 0)){
		System.out.println("Perro mueve la cola");
	}
	else if ((animo < 0) && (umbral > -20)){
		System.out.println("Perro ladra");
	}
	else if ((animo < 0) && (unbral < -20)){
		System.out.println("Perro muerde");
	}
}