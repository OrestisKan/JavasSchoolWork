import java.util.ArrayList;

public class Intercity extends Trains {

	public Intercity(String dTime, String aTime, ArrayList<String> IStops, ArrayList<String> aStops) {
		super(dTime, aTime, IStops, aStops);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object arg0) {
		boolean ans = false;
		if (arg0 instanceof Intercity) {
			ans=true;
		}
		return ans;
	}
		
}
