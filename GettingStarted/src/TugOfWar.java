
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        int P1total = 0;
        int P2total = 0;

        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        while(true){

            if(redButton.getState()) {
                P1total += 1;
                //System.out.println(P1total);
            } 

            if(greenButton.getState()) {
                P2total += 1;
                //System.out.println(P2total);
            }
            
            if (P1total == 10) {
            	System.out.println("Player 1 Wins! ");
            	redLED.setState(true);
            	Thread.sleep(500);
            	greenLED.setState(true);
            	Thread.sleep(500);
            	redLED.setState(false);
            	Thread.sleep(1000);
            	greenLED.setState(false);
            	Thread.sleep(1000);
            	
            	for (int i = 0; i < 5; i++) {
            		redLED.setState(true);
                    Thread.sleep(1000);
                    redLED.setState(false);
                    Thread.sleep(1000);
            	}
            	
            	break;
            }
            
            else if (P2total == 10) {
            	System.out.println("Player 2 Wins! ");
            	redLED.setState(true);
            	Thread.sleep(1000);
            	greenLED.setState(true);
            	Thread.sleep(1000);
            	redLED.setState(false);
            	Thread.sleep(1000);
            	greenLED.setState(false);
            	Thread.sleep(1000);
            	
            	for (int i = 0; i < 5; i++) {
            		greenLED.setState(true);
                    Thread.sleep(1000);
                    greenLED.setState(false);
                    Thread.sleep(1000);
            	}
            	
            	break;
            }

            Thread.sleep(150);
        }
    }
}
  