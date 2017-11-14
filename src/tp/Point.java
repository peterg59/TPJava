package tp;

public class Point {
	
	private final int INIT_X = 25, INT_Y = 25;
	private int x, y;
	
	public Point() {
		this.x = INIT_X;
		this.y = INT_Y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + getX() + "," + getY() + "]";
	}
}
