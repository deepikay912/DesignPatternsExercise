/**
 * Dime is a type of coin
 * Deepika
 * 02/06/2019
 */
public class Dime implements Coin
{
    private final int VALUE_IN_CENTS = 10;
    
    public int getValue() {
        return VALUE_IN_CENTS;
    }
}