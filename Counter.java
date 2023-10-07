/**
 * This class models a tally counter
 */

 public class Counter{
    private int value;

    /**
     * Gets the current value of this counter.
     * @return the current value
     */
    public int getValue(){
        return this.value;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click(){
        this.value++;
    }

    /**
     * Undoes the button click.
     */

    public void undo(){
        this.value--;
        this.value = Math.max(this.value, 0);
    }
    /**
     * Resets the value of this counter to 0.
     */
    public void reset(){
        this.value=0;
    }
 }