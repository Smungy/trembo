/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.trembo.negocio;

import java.util.Scanner;

/**
 * Contiene métodos y clases para remplazar los elementos de una cadena ingresada en consola
 * para después invertirla.
 * @author Jesus Alan
 */
public class Trembo {

    public static boolean palindromo(String oracion){
   
        //Limpiamos la cadena de texto 
        String oracionNormal = oracion.replace(",", "")
                .replace("!", "")
                .replace("¡", "")
                .replace(" ", "")
                .toLowerCase().trim();
        
                //Invocamos la clase StringBuilder usando la variable de la oracion ya limpia.
		StringBuilder stringBuilder = new StringBuilder(oracionNormal);
                
                //Usamos el método reverse de la clase stringBuilder y lo hacemos cadena de texto con el método toString
		String oracionInvertida = stringBuilder.reverse().toString();
                
                 //Termina la función y devulve el valor
                return oracionNormal.equals(oracionInvertida);
    }
}
