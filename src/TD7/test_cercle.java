package TD7;

public class test_cercle {
	public static void main(String[] args) {
		cercle coco = new cercle(4.5);
		cercle bibi = new cercle(5.6);
		float peri = coco.perimetre();
		int comparaison= coco.compareTo(bibi);
		System.out.println("Le perimètre de coco est "+ peri);
		System.out.println(comparaison); // return -1 donc coco a un plus grand rayon
	}

}
