
import java.util.*;

public class GumballMachine
{
    private static int numberOfGumballs;
    private final Set<Coin> ACCEPTABLE_COINS = new HashSet<>();
    private final int GUMBALL_COST;
    private int insertedCoinsValue;
    
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
    
    State state = soldOutState;
 
  
   public GumballMachine(int numberOfgumballs, Set<Coin> acceptableCoin, int cost )
    {
        this.numberOfGumballs = numberOfgumballs;
        this.GUMBALL_COST = cost;
        this.ACCEPTABLE_COINS.addAll(acceptableCoin);

        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);

        if (this.numberOfGumballs > 0) {
            state = noCoinState;
        } 
    }
 
    public void insertCoins(List<Coin> insertedCoins) {
        calculateTotalValueOfCoins(insertedCoins);
        state.insertCoins(insertedCoins);
    }
 
    public void ejectCoins() {
        state.ejectCoins();
    }
 
    public void turnCrank() {
        state.turnCrank();
      //  state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall(int gumballsReleased) {
        System.out.println("A gumball comes rolling out the slot...");
        if (numberOfGumballs != 0) {
            numberOfGumballs = numberOfGumballs - gumballsReleased;
        }
    }
 
    int getCount() {
        return numberOfGumballs;
    }
 
    void refill(int numberOfGumballs) {
        this.numberOfGumballs = numberOfGumballs;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + numberOfGumballs + " gumball");
        if (numberOfGumballs != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
    
    public int getGUMBALL_COST() {
        return GUMBALL_COST;
    }
    
    public Set<Coin> getACCEPTABLE_COIN_TYPES() {
        return ACCEPTABLE_COINS;
    }
    
    public void calculateTotalValueOfCoins(List<Coin> coins) {
      
        for(Coin coin : coins ) {
           insertedCoinsValue+= coin.getValue();
        }
    }
      // return total value of coins inserted  
     public int getTotalValueOfCoins() {
         return insertedCoinsValue;
        }
         
    }
    

