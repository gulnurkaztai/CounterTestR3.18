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
        counter.undo();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.setLimit();
        System.out.println("Expected value is 5"); // Should return the limit if it was clicked more than 5 times and value > 5
        System.out.println("Value: " + counter.getValue());
     }
}
