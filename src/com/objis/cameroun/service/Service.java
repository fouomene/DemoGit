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
		// TODO Auto-generated method stub
		return 0;
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

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#perimetreRectangle(int, int)
	 * @author Sonia
	 * Methode perimetreRectangle prend en parametre deux entiers et retourne le perimetre d'un rectangle 
	 */
	@Override
	public int perimetreRectangle(int longeur, int largeur) {
		int perimetre = (longeur + largeur) * 2;
		return perimetre;
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
		// TODO Auto-generated method stub
		return 0;
	}

}
