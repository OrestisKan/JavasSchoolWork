import java.util.ArrayList;

public class Sprinter extends Trains {

	public Sprinter(String dTime, String aTime, ArrayList<String> IStops ,ArrayList<String> aStops) {
		super(dTime, aTime, IStops, aStops);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object arg0) {
		boolean ans = false;
		if (arg0 instanceof Sprinter) {
			ans=true;
		}
		return ans;
	}

}
