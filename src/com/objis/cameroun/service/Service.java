package com.objis.cameroun.service;



public class Service implements IService {

	public Service() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int somme(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
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
		return 0;
	}

	@Override
	public int perimetreRectangle(int longeur, int largeur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int surfaceRectangle(int longeur, int largeur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int conversionFCFAEURO(int montant) {
		// TODO Auto-generated method stub
		return 0;
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
	public int surfaceCercle(int rayon) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double circonferenceCercle(int rayon) {
		// TODO Auto-generated method stub
		return (2 * Math.PI * rayon);
	}

	@Override
	public int sommeTripple(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
