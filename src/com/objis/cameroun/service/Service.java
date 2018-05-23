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
