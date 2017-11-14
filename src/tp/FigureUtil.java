package tp;

public class FigureUtil {
	
	public static Rond getRandomRond(){
		
		int r = (int) (Math.random() * 10);
		Rond rond = new Rond(FigureUtil.getRandomPoint(), r);
		
		return rond;
	}
	
	public static Rectangle getRandomRectangle() {
		int la = (int) (Math.random() * 10);
		int lon = (int) (Math.random() * 10);
		
		Rectangle rect = new Rectangle(getRandomPoint(), la, lon);
		return rect;
	}
	
	public static Point getRandomPoint(){
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		
		Point p = new Point(x,y);
		return p;
	}
}
