
//Add Phidgets Library
import com.phidget22.*;

public class DataInterval {
    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Temperature Event |  Event code runs when data input from the sensor changes. The following event is a Temperature change event. The contained code will only run when the temperature input changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature());
            }
        });

        //Open
        temperatureSensor.open(5000);

        //Set Data Interval | The Data Interval controls how often the program collects data from your Phidget. The Data Interval ranges from 500 ms - 60000 ms.
        temperatureSensor.setDataInterval(60000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

// Setting data interval to 500ms prints out the temperature every 0.5 seconds
// Setting it to 60,000ms prints it out once a minute 

// LED and Buttons would not have a data interval since they're not measuring anything 