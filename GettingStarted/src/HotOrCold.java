
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
    public static void main(String[] args) throws Exception{
        //Create | Create objects for your buttons and LEDs.
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redLED.open(1000);
        greenLED.open(1000);

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);
        
        while (true) {
        if (temperatureSensor.getTemperature() < 24 && temperatureSensor.getTemperature() > 20) {
        	greenLED.setState(true);
        	Thread.sleep(1000);
        	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        }
        
        else {
        	redLED.setState(true);
        	Thread.sleep(1000);
        	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        }
        }
        //Use your Phidgets | This code will print the temperature every 150ms
        //while (true) {
            //System.out.println("Temperature: " + ((temperatureSensor.getTemperature() * 1.8) + 32) + " °F" );
            //Thread.sleep(150);
        //}
    }
}
  