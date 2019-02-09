
import java.util.*;

public interface State {
 
	public void insertCoins(List<Coin> insertedCoins);
	public void ejectCoins();
	public void turnCrank();
	public void dispense(int gumballCount);
}
