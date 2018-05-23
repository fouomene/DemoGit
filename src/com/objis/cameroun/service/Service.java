package com.objis.cameroun.service;

import java.rmi.RemoteException;

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

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#division(int, int)
	 * Méthode division qui permet de calculer le quotient des paramètres int a et int b
	 * AUTEUR: Emmanuel Roussel
	 */
	@Override
	
	public int division(int a, int b) {
	
		 	int quotient = a/b;
			return quotient;
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
