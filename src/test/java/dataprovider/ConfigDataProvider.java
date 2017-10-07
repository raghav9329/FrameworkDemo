package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;

public ConfigDataProvider(){
	try{
		File src= new File("./Configuration/config.properties");
		FileInputStream fis= new FileInputStream(src);
		pro = new Properties();
		
	}Catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
}
