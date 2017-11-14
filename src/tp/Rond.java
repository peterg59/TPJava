package tp;

public class Rond {
	
	Point point;
	int rayon;
	
	public Rond(Point p, int r) {
		point = p;
		rayon = r;
	}
	
	
	@Override
	public String toString() {
		return "[ROND " + point.toString() + " , " + rayon +" ]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
}
