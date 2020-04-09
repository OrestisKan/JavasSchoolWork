
public class Point {
	
	private double x;
	private double y;
	
	public double getX(){return x;}
	public double getY() {return y;}
	
	public void setX(double b) {x=b;}
	public void setY(double b ) { y=b;}
	
	Point p = new Point(2.0,5.0);
	public Point(double v , double b) {
			p.setX(v);			
			p.setY(b);
	
	}//end of point()
	
	
	public void translate(double dx ,double dy)
	{
		p.setX(p.getX()+dx);
		p.setY(p.getY()+dy);
	}	
	
	public double distance(Point other)
	{
		return Math.sqrt( (p.getX()-other.getX())*(p.getX()-other.getX()) +(p.getY()-other.getY())*(p.getY()-other.getY()) );
	}
	
	public boolean equals(Object other)
	{
		boolean ans;
		if (p.equals(other)==true) {
			ans=true;
		}else {
			ans=false;
		}
	
		return ans;
	}
	
	public String toString()
	{
		return "Point (" + p.getX() +", "+p.getY()+")";
	}
}

	