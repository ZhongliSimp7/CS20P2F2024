
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Thermostat {
    public static void main(String[] args) throws Exception{
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        // Create object for the temperature sensor 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.open(1000);
        
        double waitTime = 10;
        
        int setTemp = 21;
        while(true) {
        	if (greenButton.getState() == true) {
        		setTemp++;
        		System.out.println("Set temperature: " + setTemp + " °C" );
        	}
        	else if (redButton.getState() == true) {
        		setTemp--;
        		System.out.println("Set temperature: " + setTemp + " °C" );
        	}

        	if (waitTime >= 10) {
        		System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        		waitTime = 0;
        	} 
        	
        	waitTime += 0.1;
        	
        	if (temperatureSensor.getTemperature() < (setTemp + 2) && temperatureSensor.getTemperature() > (setTemp - 2)) {
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else {
        		redLED.setState(true);
        		greenLED.setState(false);
        	}
        	
        	Thread.sleep(100);
        }
        
    }   
}