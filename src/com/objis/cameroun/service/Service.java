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

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#perimetreCarre(int)
	 * la methode permet de calculer le perimetre du carre fait par flaubert
	 */
	@Override
	public int perimetreCarre(int cote) {
		
		return cote *4;
	}

	@Override
	public int calculBenefice(int prixAchat, int prixVente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
