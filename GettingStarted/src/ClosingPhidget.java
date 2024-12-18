
//Add Phidgets Library
import com.phidget22.*;

public class ClosingPhidget {
    public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        
        temperatureSensor.open(1000);
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        // Error - Source not found if not opened again
        // After opening the program works again
    }
}
