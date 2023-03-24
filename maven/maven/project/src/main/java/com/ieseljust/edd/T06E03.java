package com.ieseljust.edd;
import java.util.Scanner;

// Autor: Abdó
public class T06E03 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        //a)	Crea 3 vectors d'enters (v1, v2 i v3) sense reservar memòria (sense indicar la grandària ni posar valors inicials).
        int v1[];
        int v2[];
        int v3[];

        //b)	Pregunta per teclat quantes dades es volen guardar en els vectors (només 1 quantitat, igual per als 3).
        System.out.print("Quans elements té cada vector? ");
        int qElem = teclat.nextInt();

        //c)	Reserva memòria al vector1 amb eixa quantitat d'elements introduïda.
        v1 = new int[qElem];

        //d)	Ompli v1 amb dades introduïdes per teclat.
        System.out.println("Anem a omplir el vector v1:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(" - Número per a la posició " + i + ": ");
            v1[i] = teclat.nextInt();
        }

        //e)	Copia el vector v1 al vector v2, en una sola operació.
        v2 = v1;  // Estaran apuntant a la mateixa zona de memòria.

        //f)	Copia el vector v1 al vector v3, copiant component a component. Primer caldrà reservar memòria per a v3.
        v3 = new int[qElem]; // Abans d'assignar valors en v3, li hem de reservar memòria.
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i]; // Es copien els valors però v3 i v1 apunten a zones de memòria diferents.
        }

        //g)	Mostra per pantalla si v1 és igual a v2, en una sola operació. Fes el mateix per a v1 i v3
        if (v1 == v2) {
            System.out.println("v1 i v2 són iguals (apunten a la mateixa zona de memòria)");
        } else {
            System.out.println("v1 i v2 són distints (apunten a distinta zona de memòria)");
        }
        if (v1 == v3) {
            System.out.println("v1 i v3 són iguals (apunten a la mateixa zona de memòria)");
        } else {
            System.out.println("v1 i v3 són distints (apunten a distinta zona de memòria)");
        }
        //h)	Mostra per pantalla si v1 és igual a v3, component a component (però només haurà de dir: "vectors iguals" o "vectors diferents").
        boolean iguals = true;
        for (int i = 0; i < qElem; i++) {
            if (v1[i] != v3[i]) {
                iguals = false;
                break;
            }
        }
        if (iguals) {
            System.out.println("v1 i v3 són iguals (component a component)");
        } else {
            System.out.println("v1 i v3 són distints (component a component)");
        }
        //i)	Mostra el que hi ha en cada posició de cada vector (format lliure).
        System.out.println("Pos.\tv1\tv2\tv3");
        System.out.println("\t---\t---\t---");
        for (int i = 0; i < qElem; i++) {
            System.out.println(i + "\t" + v1[i] + "\t" + v2[i] + "\t" + v3[i]);
        }

        //j)	Fes que els 3 vectors ara tinguen 5 dades cadascun. I que totes les dades tinguen el valor -1. Torna a mostrar el contingut dels vectors.
        System.out.println("Assignem 5 posicions a cada vector amb valors -1:");
        v1 = new int[]{-1, -1, -1, -1, -1};
        v2 = new int[]{-1, -1, -1, -1, -1};
        v3 = new int[]{-1, -1, -1, -1, -1};
        /*
        També s'haguera pogut fer així:
        v1 = new int[5];
        v2 = new int[5];
        v3 = new int[5];

        for (int alu = 0; alu < v1.length; alu++) {
            v1[alu] = v2[alu] = v3[alu] = -1;  // O bé amb 3 instruccions       
        }
        */
        System.out.println("Pos.\tv1\tv2\tv3");
        System.out.println("\t---\t---\t---");
        for (int i = 0; i < qElem; i++) {
            System.out.println(i + "\t" + v1[i] + "\t" + v2[i] + "\t" + v3[i]);
        }
    }

}
