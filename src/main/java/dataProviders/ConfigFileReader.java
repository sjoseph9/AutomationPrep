package dataProviders;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties prop;
   private FileInputStream fis;

     public ConfigFileReader() throws IOException {
         prop = new Properties();

        fis = new FileInputStream("config/config.properties");

         prop.load(fis);
     }
     public String getGlobalProperties(String input)
     {
         return prop.getProperty(input);
     }
}
