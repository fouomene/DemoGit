package com.objis.cameroun.service;

import java.rmi.RemoteException;

public class Service implements IService {

	public Service() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#somme(int, int)
	 * La methode permet de calculer la somme de 2 entiers
	 * Methode implementée par Cyrille
	 */
	@Override
	public int somme(int a, int b) {
		int som = a + b;
		return som;
	}

	/* Cette methode devrait etre implementée par Frank, mais par soucis de connexion internet, Mr Fouomene a implémenté*/
	@Override
	public int soustration(int a, int b) {
		
		int resultat;
		
		resultat = a - b;
		
		return resultat;
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

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#produit(int, int)
	 * Cette méthode permet d'effectuer le produit de deux entiers a et b par Maurain
	 */
	@Override
	public int produit(int a, int b) {
	       
		int resultat;
		resultat = a * b;
		return resultat;
		
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

	
	// Methode devant etre implementee par Flaubert, mais par souci de connexion internet elle est implementee par Sonia
	@Override
	public int surfaceRectangle(int longeur, int largeur) {
		int surface = longeur * largeur;
		return surface;
	}

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#conversionFCFAEURO(int)
	 * methode permettant de convertir le francs cfa en euro
	 */
	@Override 
	public int conversionFCFAEURO(int montant) {
		
		
		return montant/655;
	}

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#perimetreCarre(int)
	 * la methode permet de calculer le perimetre du carre fait par flaubert
	 */
	@Override
	public int perimetreCarre(int cote) {
		
		return cote *4;
	}

	/* (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#calculBenefice(int, int)
	 * methode permet de calculer le benefice
	 author stephanie ntamack
	 */
	@Override
	public int calculBenefice(int prixAchat, int prixVente) {
		
		
		int benefice;
		
		benefice = prixVente - prixAchat;
		
		return benefice;
	}

}
