
public class Circle 
{
	
	private double radius;
	private Point center ;

	public double getRadius(){return radius;}
	public Point getCenter() {return center;}

	public void setRadius(double b) {radius = b;}
	public void setCenter(Point b ) { center=b;}

		
	
	public Circle(Point b, double v)
	{
		center=b;
		if (v>=0) {
			radius=(v);
		}else {
			radius=(0);
		}
		
		
	}//end of circle constructor 
	
	
	public String toString()
	{
		return "Circle (" + center +", "+radius+")";
	}//end of toString method 
	
	
	public boolean equals(Object other)
	{
		if (other instanceof Circle)
		{
			if (((Circle) other).center == center) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}//end of equals method 

	
	public double periphery()
	{
		return 2*(Math.PI)*radius;
	}//end of periphery method 
	
	public double surface()
	{
		return (Math.PI)*(radius)*(radius);
	}//end of surface method 
	
	public void translate(double dx, double dy)
	{
		center.setX(center.getX()+dx);
		center.setY(center.getY()+dy);
			
	}//end of translate
	
	public boolean overlappingWith(Circle other)
	{
		boolean ans;
		double dist;
		
		if (other instanceof Circle) {
			dist = Math.sqrt( (center.getX()-other.center.getX())*(center.getX()-other.center.getX()) +(center.getY()-other.center.getY())*(center.getY()-other.center.getY()) );
			
			if (dist >= (radius+other.getRadius())) {
				ans=false;
			}else {
				ans=true;
			}
			}else {
				ans=false;
		}
		return ans;
	}//end fo overlapping with method
	
	









}//end of Circle class
	
	

	
	

	
