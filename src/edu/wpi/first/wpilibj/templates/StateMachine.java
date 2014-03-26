package edu.wpi.first.wpilibj.templates;

/**
 * This is a generic state machine, using the StateMachineBase class.  The code
 * demands certain requirements from the machine, and if these are met, the 
 * state is advanced.  When the state is advanced, given tasks will be performed.
 * 
 * @author (Mark Macerato)
 */
public class StateMachine extends StateMachineBase {

    /*
     * Check if machine is ready to advance state
     * 
     * @Override
     */
    public void execute() {
        if (readyForNextState()) {
            exitState();
            enterNextState();
        }
    }

    /*
     * Conditions for advancing state
     * 
    * @Override
    */
    public boolean readyForNextState() {
        switch (State.state) {
            case State.INITIAL:
                return true;
        }
        return false;
        
    }
    
     /*
      * Tasks to perform when advancing state
      * 
     * @Override
     */
    public void enterNextState() {
         switch (State.state) {
            case State.INITIAL:
                //Nothing by default
        }
    }
    
}