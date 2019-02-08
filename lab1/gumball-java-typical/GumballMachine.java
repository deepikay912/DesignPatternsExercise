import java.util.*;

public class GumballMachine
{
    private int numberOfGumballs;
    private boolean haveCoins;
    private final Set<Coin> ACCEPTABLE_COINS = new HashSet<>();
    private final int GUMBALL_COST;
    private int insertedCoinsValue;
    
    // Constructor
    // @numberOfgumballs - number of gumballs filled when initialization
    // @acceptableCoin - type of coins that machine accepts - depends on machine model
    // @cost - cost of each gumball
    
   public GumballMachine(int numberOfgumballs, Set<Coin> acceptableCoin, int cost )
    {
        this.numberOfGumballs = numberOfgumballs;
        this.haveCoins = false;
        this.GUMBALL_COST = cost;
        this.ACCEPTABLE_COINS.addAll(acceptableCoin);
    }
    
    //When  coins are inserted, this method checks if coins are valid and coins are sufficient to eject gumball
    // if coins are invalid, machine rejects coins with proper message
    // @coins - inserted coins by user
    
    public void insertCoins(List<Coin> coins)
    {
        System.out.println( "Validating coins.. Please wait" ) ;
        
        this.insertedCoinsValue = calculateCoinsValue(coins);
        boolean validCoins = checkIfCoinsAreAcceptable(coins);
        
        //check for sufficiency only when coins are valid
        boolean sufficientCoins = validCoins && checkIfCoinsAreSufficienct(coins);
        
        if(validCoins && sufficientCoins ) {
           
           System.out.println( "Coins are valid.. turn crank to get gumball" ) ; 
           this.haveCoins = true;
        }
    }

    //when user turned cranck, check for the value of coins he inserted, eject gumballs for the value
    // if there are no sufficient gumballs, ejecting available gumballs,reject extra coins with a message
    // if there are no gumballs, rejet all  coins
    //If he inserted extra coins, reject them as well with messsage 
    // if there are no coins inserted , print relevant message
    
    public void turnCrank()
    {
        if ( this.haveCoins )
        {
            if ( this.numberOfGumballs > 0 )
            {
                int gumballsToBeEjected = this.insertedCoinsValue/GUMBALL_COST;
                if(this.numberOfGumballs >= gumballsToBeEjected) { 
                this.numberOfGumballs -= gumballsToBeEjected ;
                this.haveCoins = false ;
                System.out.println( "Thanks for your coins..  Dispensing " + gumballsToBeEjected + " gumballs.. Enjoy your day!!" ) ;
                
                int extraCoins = this.insertedCoinsValue%GUMBALL_COST;
                if(extraCoins != 0) {
                   System.out.println( "Hey .. you inserted extra  " + extraCoins + " coins Collect back.." ) ; 
                } 
                }
                else {
                     System.out.println( "Hey..we don't have " + gumballsToBeEjected + " gumballs right now.. Dispensing available  " + numberOfGumballs
                        +  " gumballs and returning remaining coins") ;
                }
            }
            else
            {
                System.out.println( "No More Gumballs! Rejecting your coins.." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert coins.." ) ;
        }        
    }
    
   // check if inserted coins are accepted in installed gumball machine, if not reject coins 
    public boolean checkIfCoinsAreAcceptable(List<Coin> coins) {
        
      boolean validCoin = false;   
        for(Coin coin : coins) {
               for(Coin coinType : ACCEPTABLE_COINS ) {
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
       if(this.insertedCoinsValue < GUMBALL_COST) {
           System.out.println( "Insufficient coins..Each gumball costs :  " + GUMBALL_COST + " cents.. Please try again !!" ) ;
           return false;
        }
      return true;
    }
    
    //calculate total value of coins inserted
    public static int calculateCoinsValue(List<Coin> coins) {
        int totalValue = 0;
        
        for(Coin coin : coins ) {
           totalValue+= coin.getValue();
        }
        return totalValue;
    }
}
