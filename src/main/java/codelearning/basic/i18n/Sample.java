package codelearning.basic.i18n;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Locale l = new Locale(null)
		Locale locale = Locale.getDefault();
		System.out.println(locale);
//		System.out.println(locale.getDisplayCountry());  
//		System.out.println(locale.getDisplayLanguage());  
//		System.out.println(locale.getDisplayName());  
//		System.out.println(locale.getISO3Country());  
//		System.out.println(locale.getISO3Language());  
//		System.out.println(locale.getLanguage());  
//		System.out.println(locale.getCountry());  
		 ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",locale);
		 String greeting = bundle.getString("greeting");
		//  System.out.println("Message in नमस्ते"+locale +":"+greeting);
		 Properties properties = System.getProperties();
		 System.out.println(properties.getProperty("file.encoding"));
		 
		 Properties appProps = new Properties();
		 appProps.load(new FileInputStream("MessageBundle_en_US.properties"));
		 String value = appProps.getProperty("greeting");
		 System.out.println(value);
	}

}
