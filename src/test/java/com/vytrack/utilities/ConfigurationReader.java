package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//ConfigurationReader.configFile.getProperty("browser") direct access
//ConfigurationReader.getProperty("browser")
public class ConfigurationReader {
    /*static variable(configFile) can be accessed without object initialization
    * The value of this static field will be shared across
    *  all object of either same of any different class.*/
    //this class will be responsible for loading properties file and will provide access
    //to values based on key names
    //we use Properties class to load custom .properties files
    private static Properties configFile;
// A static block is used for initializing static variables.
// If static variables require additional, multi-statement logic while initialization, then a static block can be used.

    static {
        try {
            //provides access to file
            //try/catch block stands for handling exceptions
            //if exception occurs, code inside a catch block will be executed
            //any class that is related to InputOutput produce checked exceptions
            //without handling checked exception, you cannot run a code
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            //initialize properties object
            configFile = new Properties();
            //load configuration.properties file
            configFile.load(fileInputStream);
            //close input stream
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Failed to load properties file!");
            e.printStackTrace();
        }
    }
/*static methods also belong to a class instead of the object, and so they can be called without creating the object of the class
static methods are widely used in utility and helper classes
*/
    public static String getProperty(String key) {
         return configFile.getProperty(key);
    }
   // eg: static int b=300;  call:sout(obj1.b) ONLY be one COPY, if   you have 100 variable all value is 300

}
