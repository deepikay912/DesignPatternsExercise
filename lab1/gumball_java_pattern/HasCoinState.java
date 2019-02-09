

import java.util.List;

public class HasCoinState implements State {
    GumballMachine gumballMachine;
 
    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoins(List<Coin> insertedCoins) {
        System.out.println("You can't insert another coin..");
    }
 
    public void ejectCoins() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    
     //when user turned cranck, check for the value of coins he inserted, eject gumballs for the value
    // if there are no sufficient gumballs, ejecting available gumballs,reject extra coins with a message
    // if there are no gumballs, rejet all  coins
    public void turnCrank() {
        
           System.out.println("You turned...");
           int numberOfGumballs = gumballMachine.getCount();
           int insertedCoinsValue = gumballMachine.getTotalValueOfCoins();
           int gumballCost = gumballMachine.getGUMBALL_COST();
           
	
            if (numberOfGumballs > 0 )
            {
                int gumballsToBeEjected = insertedCoinsValue/gumballCost;
                if(numberOfGumballs >= gumballsToBeEjected) { 
                numberOfGumballs -= gumballsToBeEjected ;
                
               gumballMachine.setState(gumballMachine.getSoldState());
               gumballMachine.getState().dispense(gumballsToBeEjected);
               
            }
             else {
                     System.out.println( "Hey..we don't have " + gumballsToBeEjected + " gumballs right now.. Dispensing available  " + numberOfGumballs
                        +  " gumballs and returning remaining coins") ;
                        gumballMachine.setState(gumballMachine.getSoldState());
               gumballMachine.getState().dispense(numberOfGumballs);
                }
            }
            else
            {
                ejectCoins();
                gumballMachine.setState(gumballMachine.getSoldOutState());
                
                
            }
        }
       

    public void dispense(int gumballs) {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
