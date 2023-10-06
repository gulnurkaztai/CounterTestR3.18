/**
 * A class to test the Counter class.
 */

public class CounterTest {
    /**
     * Tests the methods of the Counter class.
     * @param args not used
     */

     public static void main(String[] args){
        Counter counter = new Counter();
        counter.click();
        counter.click();
        counter.click();
        System.out.println("Expected value is 3");
        System.out.println("Value: " + counter.getValue());
     }
}
