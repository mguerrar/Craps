
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int d1;
    private int d2;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        // put your code here
        d1 = (int)(Math.random() * 6 + 1);
        d2 = (int)(Math.random() * 6 + 1);
        int total = d1 + d2;
        return total;
    }
}
