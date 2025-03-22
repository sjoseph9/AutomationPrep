package managers;

import dataProviders.ConfigFileReader;

import java.io.IOException;

//SingleTon pattern.
//Create a single  instance of config.properties file, even though it is being called multiple times(url/browser)
public class FileReaderManager {
    private static FileReaderManager frm = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private FileReaderManager()
    {

    }
    public static FileReaderManager getInstance()
    {
        return frm;
    }
    public ConfigFileReader getConfigFileReader() throws IOException {
        return(configFileReader==null)? configFileReader = new ConfigFileReader() :configFileReader;
    }
}
