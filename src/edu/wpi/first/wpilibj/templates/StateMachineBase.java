package edu.wpi.first.wpilibj.templates;

/*
 * Abstract base for a generic state machine.  A byte state is advanced
 * through set values when certain conditions specified in the child class are 
 * met. For a given state, the child class will execute the code allocated to 
 * that state.
 * 
 * @author (Mark Macerato)
 */

public abstract class StateMachineBase {
    
    /*
     * Nested class containing state variable and possible state values
     */
    abstract static class State {
        static byte state = 0;
        static final byte INITIAL = 0;
    }
    
    /**
     * Will check if conditions for state advance are met in child class
     */
    protected void execute() {
    }
    
    /**
     * Check if machine is ready for the next state
     * @return Whether or not tasks have been finished
     */
    protected abstract boolean readyForNextState();
    
    /**
     * Advance to next state.  Do not override.
     */
    protected void exitState() {
        State.state++;
    }
    
    /**
     * Specify what tasks need to be performed in each state. 
     */
    protected abstract void enterNextState();
            
}
