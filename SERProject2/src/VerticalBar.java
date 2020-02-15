import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 *@author Raghavan
 *@version 1.0
 */
public class VerticalBar extends Shapes {
	
	Shape square = null;
	double x,y;
	public VerticalBar(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x ;
		this.y = y ;
	}
	/**
	 * Draws a square using Rectangle2D
	 * @param graphic
	 * @param x - x coordinate for the shape
	 * @param y - y coordinate for the shape
	 */
	@Override
	public void drawShape(Graphics graphic) {
		square = new Rectangle2D.Double(x , y , 7, 180);
		Graphics2D graphics2 = (Graphics2D) graphic;
		graphics2.fill(square);
		
		
	}

	@Override
	public boolean containsPoint(int x, int y) {
		// TODO Auto-generated method stub
		return square.contains(x, y);
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return (int) x;
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x ;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return (int) y;
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y ;
	}
	
	
}