
import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
	         //acceptable coins could be anything in Quarter,Nickel,Dime depends on our machine model      
	        Set<Coin> acceptableCoins = new HashSet<>();
	        acceptableCoins.add(new Quarter());
	        
	        List<Coin> coinsInserted = new ArrayList<>();
	        coinsInserted.add(new Quarter());
	        
	        // Gumball machine 1 which accepts only quarters and one gumball costs 25 cents
		GumballMachine gumballMachine1 = new GumballMachine(5,acceptableCoins,25);
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoins(coinsInserted );
		gumballMachine1.turnCrank();
		
		acceptableCoins.clear();
		coinsInserted.clear();
		
		acceptableCoins.add(new Quarter());
		// Gumball machine 2 which accepts only quarters and one gumball costs 50 cents
		GumballMachine gumballMachine2 = new GumballMachine(10,acceptableCoins,50);
		System.out.println(gumballMachine2);
		coinsInserted.add(new Nickel());
		gumballMachine2.insertCoins(coinsInserted );
		gumballMachine2.turnCrank();
		
		acceptableCoins.clear();
		coinsInserted.clear();
		
		
		acceptableCoins.add(new Quarter());
	        acceptableCoins.add(new Nickel());
	        acceptableCoins.add(new Dime());
	        // Gumball machine 1 which accepts quarters,dimes,nickel and one gumball costs 50 cents
	        // Gumballs return counts depends on coins user enters.. not just a one gumball once machine
		GumballMachine gumballMachine3 = new GumballMachine(10,acceptableCoins,50);
		System.out.println(gumballMachine3);
		
		coinsInserted.add(new Nickel());
		coinsInserted.add(new Dime());
		coinsInserted.add(new Dime());
		coinsInserted.add(new Nickel());
		coinsInserted.add(new Dime());
		coinsInserted.add(new Dime());
		coinsInserted.add(new Quarter());
		gumballMachine3.insertCoins(coinsInserted );
		gumballMachine3.turnCrank();
		
	}
}
