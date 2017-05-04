package edu.jalc.momentopattern.logging.observers;

import java.awt.*;
import edu.jalc.momentopattern.logging.observers.Observer;
import edu.jalc.momentopattern.logging.Message;
import edu.jalc.momentopattern.logging.State;



public class LogBeeper implements Observer{
  private State rootLevel;
  public void observe(Message message){
    if(message.ordinal >= State.ERROR) logBeeper();

  }

  public void logBeeper(){
  Toolkit.getDefaultToolkit().beep();
  }

  //Mimic ConsoleLogger here

}
