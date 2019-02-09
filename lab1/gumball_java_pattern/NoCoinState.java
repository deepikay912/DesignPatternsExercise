import java.util.List;

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoins(List<Coin> insertedCoins) {
        System.out.println("You inserted coins");
        boolean coinsAreValid = validateCoins(insertedCoins);
        
        if(coinsAreValid) {
        System.out.println("Hey, we got your coins.. turn crank to get gumball");    
        gumballMachine.setState(gumballMachine.getHasCoinState());
        }
        else {
         
         ejectCoins();
         
        }
    }
 
    public void ejectCoins() {
        System.out.println("Invalid coins..collect back your money");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
     }
 
    public void dispense(int gumballs) {
        System.out.println("You need to pay first");
    } 
    
    //check if coins are valid
    public boolean validateCoins(List<Coin> coins) {
        boolean validCoins = checkIfCoinsAreAcceptable(coins);
        
        //check for sufficiency only when coins are valid
        boolean sufficientCoins = validCoins && checkIfCoinsAreSufficienct(coins);
        
        if(validCoins && sufficientCoins ) {
           
           System.out.println( "Coins are valid.. turn crank to get gumball" ) ;
           return true;
        }
        return false;
    }

    
     // check if inserted coins are accepted in installed gumball machine, if not reject coins 
    public boolean checkIfCoinsAreAcceptable(List<Coin> coins) {
        
      boolean validCoin = false;   
        for(Coin coin : coins) {
               for(Coin coinType : gumballMachine.getACCEPTABLE_COIN_TYPES() ) {
               if(coinType.getClass().toString().equals(coin.getClass().toString())) {
                   validCoin = true;
                }
            }
            if(!validCoin) {
            System.out.println( "Oops !! invalid coins..coins rejected.." ) ;
               return false;
            }
        }  
       return true;
        
    }
    
    // check if inserted coin money is sufficient enough to dispense gumball, if not reject coins
    public boolean checkIfCoinsAreSufficienct(List<Coin> coins) {
       
       if(gumballMachine.getTotalValueOfCoins() < gumballMachine.getGUMBALL_COST()) {
           System.out.println( "Insufficient coins..Each gumball costs :  " + gumballMachine.getGUMBALL_COST() + " cents.. Please try again !!" ) ;
           return false;
        }
      return true;
    }
 
    public String toString() {
		return "waiting for quarter";
	}
	
}
