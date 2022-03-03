package pays;

import java.util.ArrayList;

public class Ville {
	//Attributs
	protected String nom;
	protected Integer nbHabitants;
	protected ArrayList <Route> routes = new ArrayList <Route>();
	
	//Constructeurs
	public Ville () {
		this.nom = "";
	}
	
	public Ville (String nom) {
		this.nom = nom.toUpperCase();
	}
	
	public Ville (String nom, int nbHabitants) {
		this.nom = nom.toUpperCase();
		this.nbHabitants = nbHabitants;
	}
	
	//Getters
	public String getNom() {
		return nom;
	}
	
	public int getNbHabitants() {
		if (this.nbHabitants == null) {
			this.nbHabitants = 0;
		}
		return nbHabitants;
	}
	
	//Setters
	public void setNbHabitants(int nbHabitants) {
		if (nbHabitants < 0) {
			nbHabitants = 0;
		}
		this.nbHabitants = nbHabitants;
	}
	
	//Méthodes
	public boolean nbHabitantsConnu() {
		if (this.nbHabitants == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String toString() {
		if (this.nbHabitants ==  null) {
			return "Ville de " + this.nom + ";";
		}
		else {
			return "Ville de " + this.nom + "; " + this.nbHabitants + ".";
		}
	}
	
	public String categorie() {
		//On vérifie d'abord si le nombre d'habitants est nul ou pas
		if (this.nbHabitantsConnu()) {
			//On vérifie si la ville est une capitale
			if (this.getClass().getName() == "pays.Capitale") {
				return "C";
			}
			//On vérifie ensuite par rapport au nombre d'habitants
			else if (this.nbHabitants < 500000) {
				return "A";
			}
			
			else {
				return  "B";
			}
		}
		else {
			return "?";
		}
	}
	
	public void addRoute(Route r, boolean x) {
		//x : double sens ou pas
		this.routes.add(r);
	}
	
	public void listerRoutes() {
		System.out.println("Au départ de " + this.nom);
		for (int i = 0 ; i < routes.size() ; i++) {
			if (routes.get(i).getClass().getName() == "pays.Autoroute") {
				System.out.println(routes.get(i).nom + " -> " + routes.get(i).villeDest.nom + " (Autoroute)");
			}
			else {
				System.out.println(routes.get(i).nom + " -> " + routes.get(i).villeDest.nom + " (Route)");
			}
			
		}
		/*
		 for (int i = 0 ; i < routes.size() ; i++) {
			
			for (int j = 0 ; j < routes.get(i).listeVilles.size() ; j++) {
				if (routes.get(i).getClass().getName() == "pays.Autoroute") {
					System.out.println(routes.get(i).nom + " -> " + routes.get(i).listeVilles.get(j).nom + " (Autoroute)");
				}
				
				else {
					System.out.println(routes.get(i).nom + " -> " + routes.get(i).listeVilles.get(j).nom + " (Route)");
				}
			
			}
		
		}
		 */
		System.out.println("---------");
	}
}
