package tp;

public class Rectangle {
	
	private Point basGauche, basDroite, hautGauche, hautDroite;
	
	public Rectangle(Point p, int largeur, int longueur) {
		basGauche = p;
		basDroite = new Point(basGauche.getX(), basGauche.getY() + longueur);
		hautGauche = new Point(basGauche.getX() + largeur, basGauche.getY());
		hautDroite = new Point(basGauche.getX() + largeur, basGauche.getY()+ longueur);
	}
	
	public Point getPointBasGauche() {
		return basGauche;
	}
	
	public Point getPointBasDroit() {
		return basDroite;
	}
	
	public Point getPointHautGauche() {
		return hautGauche;
	}
	
	public Point getPointHautDroit() {
		return hautDroite;
	}
	
	@Override
	public String toString() {

		return "[" + getType() +basGauche + basDroite + hautGauche + hautDroite+ "]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
	protected String getType() {
		return "RECT";
	}
}
