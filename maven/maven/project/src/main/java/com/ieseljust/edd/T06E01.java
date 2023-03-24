

// Autor: Abdó
package com.ieseljust.edd;
import java.util.Scanner;

public class T06E01 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int edats[];

        // Preguntar quants alumnes (encara que no ho deia l'enunciat)
        System.out.println("Quants alumnes?");
        int qAlu = teclat.nextInt();

        // a) Crear un array de nom edats, de 10 elements de tipus enter, per a guardar les
        // edats de 10 alumnes.c
        edats = new int[qAlu + 1]; // reservem 11 posicions per a guardar les 10 notes
        // ja que no usarem la posició 0 per comoditat.

        // b) Omplir el vector demanant les edats per teclat.
        for (int alumne = 1; alumne < edats.length; alumne++) {
            System.out.println("Quina edat té l'alumne " + alumne + ":");
            edats[alumne] = teclat.nextInt();
        }

        // c) Demanar un número d'alumne i mostrar la seua edat. 
        // El número d'alumne serà la posició dels elements (1 a 10). 
        // No ha de donar error si s'introdueix un número incorrecte.
         
        System.out.println("Quin número d'alumne vols saber l'edat (1 al " + qAlu + "): ");
        int alu = teclat.nextInt();

        try {
            System.out.println("Té " + edats[alu] + " anys");
        } catch (Exception e) {
            System.out.println("Alumne incorrecte");
        }

        // d) Mostra quants alumnes menors d'edat
        int cMenors = 0;
        for (int alumne = 1; alumne < edats.length; alumne++) {
            if (edats[alumne] < 18) {
                cMenors++;
            }
        }
        System.out.println("Hi ha " + cMenors + " menors");

        // e) Mostrar l'edat mínima dels alumnes i a quin número d'alumne correspon. 
        // Si són molts alumnes que tenen la mínima edat, mostra el primer que aparega.
        int edatMin = edats[1];
        int aluMesJove = 1;
        for (int alumne = 2; alumne < edats.length; alumne++) {
            if (edats[alumne] < edatMin) {
                edatMin = edats[alumne];
                aluMesJove = alumne;
            }
        }

        System.out.println("Alumne més jove: " + aluMesJove + " (" + edatMin + " anys)");

        // f) Posar en altre vector de nom "majors" aquells números d'alumnes 
        // que són majors d'edat.
        
        // Creem el nou vector amb tants components com alumnes majors d'edat:
        int qMajors = qAlu - cMenors;
        int majors[] = new int[qMajors];

        // Recorrem el vector d'alumnes i anem omplint el vector de majors:
        int cMajorsTrobats = 0;
        for (int alumne = 1; alumne < edats.length; alumne++) {
            if (edats[alumne] >= 18) {
                // Posar el número de l'alumne (posició) al vector de majors
                majors[cMajorsTrobats++] = alumne;
                // Amb el ++ avancem la posició per al següent major trobat.
            }
        }

        // g) Recórrer majors i mostrar números d'alumne i les seues edats:
        System.out.println("Alumnes majors d'edat:");
        System.out.println("ALU\tEDAT");
        for (int i = 0; i < majors.length; i++) {
            int alumne = majors[i];
            System.out.println(alumne + "\t" + edats[alumne]);
        }
    }
}
