package pays;

public class Autoroute extends Route{
	//Attributs
	private int nbVoies;
	private double tarif;
	
	//Constructeur
	public Autoroute(String nom, int limitVitesse, int nbVoies, double distance, Ville v, double tarif) {
		super(nom, limitVitesse, distance, v);
		this.nbVoies = nbVoies;
		this.tarif = tarif;
	}
	
	//
}
