package main;

import java.util.Scanner;

public class Main {
	/*
	 * Demana 2 números i els guarda en variables.
	 * Mostra la seva suma i la seva multiplicació.
	 */
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introdueix un número:");
		int n1 = in.nextInt();
		System.out.println("Introdueix un altre número:");
		int n2 = in.nextInt();
		System.out.println("La suma dels dos números que has introduït és: " + (n1+n2) + " i la seva multiplicació: " + (n1*n2));
		
		in.close();
	}
}