package TD5;
/** creation d'une carafe vide 
 * @param capacite en litre de la carafe*/
public class carafe {
	//attribut
	private int capacite_,contenu_;
	
	//constructeur
	public carafe (int capacite) {
		this.capacite_=capacite;
		vider();/** même valeur que vider, eviter de faire un code 2 fois*/
	}
	public void remplir() {
		this.contenu_=capacite_;
		/* remplir pleinement une carafe*/
	}
	public void vider() {this.contenu_=0;}
	
	/** accesseur en lecture(variable connu avec un return) => pour voir contenu et capacite*/
	public int contenu() {return this.contenu_;}
	public int capacite() {return this.capacite_;}
	
	/** accesseur en ecriture privee*/
	private void Contenu(int contenu) {
		this.contenu_=contenu;
		
	}
/** transvaser la carafe c dans la carafe this 
 * @param c'est la carafe à transvaser*/
	public void transvaser(carafe c) {int reste= this.capacite_ - this.contenu_;
	if (c.contenu<reste) {
	this.contenu(Contenu()+ c.contenu());
	c.vider();}
	else { c.contenu_-= reste;
	this.remplir();
	
	}
	}
}
