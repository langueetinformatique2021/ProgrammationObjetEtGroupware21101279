package TD6;
 /**une sous-classe*/
public class felin extends animal {
	// ajout des attributs propre à la sous-classe
	protected boolean domestique= false;
	// le constructeurs felin fait appel au constructeurs de la sur-classe animal
	
	public felin(String type) {
		super(type,4);
	}
	/**presentation des caractéristique du felin*/
	public void présente() {
		// appel de la methode de la sur-classe
		super.présente();
		String etat= (domestique)? "domestique" : "sauvage";
			System.out.println("je suis vraiment un animal"+ etat);
	}
	/**cri du félin*/
	public void crie() {
		System.out.println("Meow");
	}
	
public String nom() {
	return null;
}
}
