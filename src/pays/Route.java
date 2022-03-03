package pays;

import java.util.*;

public class Route {
	//Attributs
	protected String nom;
	protected int limitVitesse;
	protected double distance;
	protected Ville villeDest = new Ville();
	protected ArrayList<Ville> listeVilles =  new ArrayList<Ville>();
	
	
	//Constructeurs
	public Route (String nom, int vit, double dis, Ville v) {
		this.nom = nom;
		this.limitVitesse = vit;
		this.distance = dis;
		this.villeDest = v;
		this.listeVilles.add(v);
	}
	
	//Méthodes
}
