package com.geometrie.demo;

public class Rectangle extends Polygone{

	private double longueur;
	private double largeur;
	
	
	public Rectangle () {}
	
	public Rectangle(double longueur, double abracaderaer) {
		this.longueur = longueur;
		this.largeur = abracaderaer;
	}
	
	@Override
	public double perimetre () {
		double perimetre = (longueur+largeur)*2;
		return perimetre;
	}
	
	public double perimetre (double longr, double larg) {
		return 0;
	}
	
	public double getLargeur() {
		return this.largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	
}
