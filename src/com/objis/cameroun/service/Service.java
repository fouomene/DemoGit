package com.objis.cameroun.service;

public class Service implements IService {

	public Service() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int somme(int a, int b) {
		
		return a+b;
	}

	@Override
	public int soustration(int a, int b) {
		// method build by jamal 
		return a - b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int produit(int a, int b) {
		// TODO Auto-generated method stub
		int produit = a*b;
		
		return produit;
	}

	@Override
	public int perimetreRectangle(int longeur, int largeur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int surfaceRectangle(int longeur, int largeur) {
		// TODO Auto-generated method stub
		return longeur * largeur;
	}

	@Override
	public int conversionFCFAEURO(int montant) {
		
		int montantEuro;
		
		montantEuro=montant*650;
		
		return montantEuro;
	}

	@Override
	public int perimetreCarre(int cote) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculBenefice(int prixAchat, int prixVente) {
		
		int benefice = (prixVente - prixAchat);
		
		return benefice;
	}

	@Override
	public double surfaceCercle(int rayon) {
		// TODO Auto-generated method stub
		return rayon*rayon*3.14;
	}

	@Override
	public double circonferenceCercle(int rayon) {
		// TODO Auto-generated method stub
		return (2 * Math.PI * rayon);
	}

	@Override
	//Methode qui renvoie la somme de ttrois nombres.
	public int sommeTripple(int a, int b, int c) {
		int resultat=a+b+c;
		return resultat;
	}

	
	

}
