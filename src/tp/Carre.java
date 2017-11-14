package tp;

public class Carre extends Rectangle{
	
	
	public Carre(Point p, int l) {
		super(p,l,l);
	}
	
	protected String getType() {
		return "CARRE";
	}
}
