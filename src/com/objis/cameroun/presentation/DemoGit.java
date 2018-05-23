package com.objis.cameroun.presentation;

import com.objis.cameroun.service.IService;
import com.objis.cameroun.service.Service;

public class DemoGit {

	public DemoGit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		IService traitement = new Service();
		
		
		System.out.println(" La conversion de 10000 FCFA en EURO = "+ traitement.conversionFCFAEURO(10000));
		
		System.out.println(" La Benefice d'un produit achter à 15000 et vendu à 20000  = "+ traitement.calculBenefice(15000, 20000));
		
		System.out.println(" La Somme de 10 et 30 = "+ traitement.somme(10,30));
		
		System.out.println(" Le Perimetre du rectangle ayant pour longueur 12 et largeur 8 = "+ traitement.perimetreRectangle(12, 8));

		System.out.println(" La division de 75 par 3 = "+ traitement.division(75, 3));
		
		System.out.println(" Le Perimetre du carre ayant pour cote 3 = "+ traitement.perimetreCarre(3));
		
		System.out.println(" La Produit de 10 et 15 = "+ traitement.produit(10, 15));
	
	}

}
