package pays;

public class Capitale extends Ville{
	//Attributs
	private String nomPays;
	
	//Constructeurs
	public Capitale(String nom, String nomPays) {
		super(nom);
		this.nomPays = nomPays.toUpperCase();
	}
	
	public Capitale(String nom, String nomPays, int nbHabitants) {
		super(nom, nbHabitants);
		this.nomPays = nomPays.toUpperCase();
	}

	//Méthodes
	public String toString() {
		if (this.nbHabitants ==  null) {
			return "Ville de " + this.nom + "; Capitale de " + this.nomPays;
		}
		else {
			return "Ville de " + this.nom + "; " + this.nbHabitants + " habitants. Capitale de " + this.nomPays;
		}
	}
}
