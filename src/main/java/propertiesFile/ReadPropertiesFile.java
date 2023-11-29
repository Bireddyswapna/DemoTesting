package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static String PropFile(String PropName) throws IOException {
        // C:\Users\softw\IdeaProjects\VijayaProject_STL\src\main\java\PropertiesFile\PropertiesFile.properties
        FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/propertiesFile/PropertiesFile.properties");
        Properties property = new Properties();
        property.load(fs);
        return property.getProperty(PropName);


    }
}
