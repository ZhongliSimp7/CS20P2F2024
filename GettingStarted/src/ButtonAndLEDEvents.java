
//Add Phidgets Library
import com.phidget22.*;

public class ButtonAndLEDEvents {
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
                turnRedLEDOn = e.getState(); 
            }
        });

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the green LED
                turnGreenLEDOn = e.getState();
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        
        //int total = 0;
        int P1total = 0;
        int P2total = 0;

        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
        while(true) {
            //turn red LED on based on red button input
        	redLED.setState(turnRedLEDOn);
            //greenLED.setState(turnRedLEDOn);
            if (redLED.getState() == true) {
                //System.out.println(total+=1);
            	P1total += 1;
            }
            //turn green LED on based on green button input
            greenLED.setState(turnGreenLEDOn);
            //redLED.setState(turnGreenLEDOn);
            if (greenLED.getState() == true) {
                //System.out.println(total+=1);
            	P2total += 1;
            }
            
            if (P1total == 10 && P1total != P2total) {
            	redLED.setState(true);
            	greenLED.setState(true);
            	System.out.println("Player 1 Wins!");
            	break;
            }
            
            if (P2total == 10 && P2total != P1total) {
            	redLED.setState(true);
            	greenLED.setState(true);
            	System.out.println("Player 2 Wins!");
            	break;
            }
            //sleep for 150 milliseconds 
            Thread.sleep(150);
        }
    }
}

// The program in lesson 3 constantly checks the state of the buttons, whereas this one simply turns on when the state changes

  