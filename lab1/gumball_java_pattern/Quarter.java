/**
 * Quarter is a type of coin
 * Deepika
 * 02/06/2019
 */
public class Quarter implements Coin
{
    private final int VALUE_IN_CENTS = 25;
    
    public int getValue() {
        return VALUE_IN_CENTS;
    }
}