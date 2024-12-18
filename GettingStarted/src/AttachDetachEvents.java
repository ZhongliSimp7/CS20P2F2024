
//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {

    public static void main(String[] args) throws Exception {
       
         //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Attach Event | Attach Events run when a Phidget is connected to the Object
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach temperature!");
            }
        });

        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach temperature!");
            }
        });
        
        //Attach Event | Attach Events run when a Phidget is connected to the Object
        greenLED.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
            	boolean attach = true;
            	if (attach == true) {
            		System.out.println("Attach LED!");
            	}
            }
        });

        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        greenLED.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
            	boolean attach = false;
            	if (attach == false) {
            		System.out.println("Detach LED!");
            	}
            }
        });
        
        //Attach Event | Attach Events run when a Phidget is connected to the Object
        greenButton.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
            	boolean attach = true;
            	if (attach == true) {
            		System.out.println("Attach Button!");
            	}
            }
        });

        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        greenButton.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
            	boolean attach = false;
            	if (attach == false) {
            		System.out.println("Detach Button!");
            	}
            }
        });
        

        //Data Event | Event code runs when data from sensor changes. 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                //Print temperature
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Open
        temperatureSensor.open(1000);
        greenLED.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}
 