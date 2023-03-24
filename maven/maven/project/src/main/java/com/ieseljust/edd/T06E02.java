/*
2. Fes un programa en Java que demane el número d’expedient, 
nota i edat de 15 alumnes (amb un únic bucle). 
Posteriorment, que mostre en 3 columnes les 3 dades de cada alumne. 
Després, es demanarà per teclat un número d’expedient 
i es mostrarà per pantalla la seua edat i nota.
 */


// Autor: Abdó
package com.ieseljust.edd;
import java.util.Scanner;

public class T06E02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        final int qAlu = 3;

        // DECLARACIÓ ESTRUCTURES DE DADES
        int expedients[] = new int[qAlu + 1];
        int notes[] = new int[qAlu + 1];
        int edats[] = new int[qAlu + 1];

        // INTRODUIR DADES
        System.out.println("Introducció de dades dels alumnes\n");
        for (int alumne = 1; alumne <= qAlu; alumne++) {
            System.out.println("Alumne " + alumne);
            System.out.print(" - Expedient: ");
            expedients[alumne] = teclat.nextInt();
            System.out.print(" - Nota: ");
            notes[alumne] = teclat.nextInt();
            System.out.print(" - Edat: ");
            edats[alumne] = teclat.nextInt();
        }

        // EIXIDA DE RESULTATS
        System.out.println("Estes són les dades de cada alumne:\n");

        System.out.println("EXP\tNOTA\tEDAT");
        for (int alumne = 1; alumne <= qAlu; alumne++) {
            System.out.println(
              expedients[alumne] + "\t" + notes[alumne] + "\t" + edats[alumne]);
        }
        
        // MOSTRAR DADES D'UN ALUMNE EN CONCRET
        // Demanem el número d'expedient:
        System.out.println("De quin alumne vols saber la nota i edat?");
        System.out.println("Dis-me el seu expedient (no el número de l'alumne): ");
        int expABuscar = teclat.nextInt();
        
        // Busquem la posició on està eixe número d'expedient:
        int posAlumneBuscat = -1;
        for (int alumne = 1; alumne <= qAlu; alumne++) {
            if (expedients[alumne] == expABuscar){
                posAlumneBuscat = alumne;
                break;
            }
        }
        
        // Si hem trobat l'alumne, mostrem les seues dades:
        if (posAlumneBuscat == -1){
            System.out.println("Alumne no trobat");
        }
        else {
            System.out.println("Expedient: " + expABuscar);
            System.out.println("Número alumne (posició): " + posAlumneBuscat);
            System.out.println("Nota: " + notes[posAlumneBuscat]);
            System.out.println("Edat: " + edats[posAlumneBuscat]);
        }

    }

}
