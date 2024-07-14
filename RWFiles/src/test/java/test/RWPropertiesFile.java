package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class RWPropertiesFile {

	public static void main(String[] args) {
		Properties properties =new Properties();
		FileInputStream input= new FileInputStream("C:\\Users\\maheshg\\Desktop\\mahii\\selenium\\Selenium projects\\RWFiles\\src\\main\\resources\\Properties\\Test_Data");
		properties.load(input);
		System.out.println(properties.getProperty("user Name"));
		System.out.println(properties.getProperty("Password"));
		FileOutputStream Output= new FileOutputStream("C:\\Users\\maheshg\\Desktop\\mahii\\selenium\\Selenium projects\\RWFiles\\src\\main\\resources\\Properties\\Test_Data");
		propeties.setProperty("Key","Value");
		properties.store(Output,null);
		

	}

}
