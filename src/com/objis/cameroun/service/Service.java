package com.objis.cameroun.service;

public class Service implements IService {

	public Service() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#somme(int, int)
	 * La methode permet de calculer la somme de 2 entiers
	 * Methode implement�e par Cyrille
	 */
	@Override
	public int somme(int a, int b) {
		int som = a + b;
		return som;
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
		// TODO Auto-generated method stub
		return 0;
	}

}
