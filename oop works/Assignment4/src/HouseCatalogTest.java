import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class HouseCatalogTest {

	@Test
	void test_constructor() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		House h = new House(a , 5 , 1000);
		Address b = new Address("Korveeestraat",299,"2628DM","Delft");
		House h2 = new House(b , 5 , 1000);
		HouseCatalog sh= new HouseCatalog();
		sh.addHouse(h);
		sh.addHouse(h2);
		assertEquals(sh.toString(),"Korveeestraat 299 2628DM Delft 5 1000 Korveeestraat 299 2628DM Delft 5 1000 ");
		
		
		
	}//end 

}
