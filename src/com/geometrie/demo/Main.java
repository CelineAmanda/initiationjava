/**
 * 
 */
package com.geometrie.demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

import com.geometrie.demo.ui.FenetrePrincipale;

/**
 * @author ASUS
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("saisir votre age");
		Scanner scan = new Scanner(System.in);
		int age = 0;
		boolean isInteger= false;
		while (!isInteger) {
			try {
				age = Integer.parseInt(scan.nextLine());
				isInteger=true;
			} catch (Exception djeunnang) {
				System.out.println("entez un nombre entier");
				isInteger= false;

			}

		}

		if (age < 21) {
			System.out.println("vous etes mineur");
		} else {
			System.out.println("vous etes majeur");
		}

	}

}
