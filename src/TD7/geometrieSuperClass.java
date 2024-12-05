package TD7;

public abstract class geometrieSuperClass {
	 protected String couleur = "noir";

	    /** création d'une nouvelle instance de la classe FigureGeometrique
	     * @param co couleur de la figure
	     */    
	    public geometrieSuperClass (String co) {
	        couleur = co; // couleur par défaut
	    }

		/** calcul du périmètre d'une figure géométrique
			 * @return périmètre
			 */    
			public abstract float perimetre();

			/** calcul de la surface d'une figure géométrique
			 * @return surface
			 */    
			public abstract float surface();
	} // fin de définition de la classe


