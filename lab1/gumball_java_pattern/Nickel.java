/**
 * Nickel is a type of coin
 * Deepika
 * 02/06/201
 */
public class Nickel implements Coin
{
    private final int VALUE_IN_CENTS = 5;
    
    public int getValue() {
        return VALUE_IN_CENTS;
    }
}