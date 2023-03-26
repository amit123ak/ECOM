package com.ibm.ecom.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("./configFile/config.properties");
        Properties pr =new Properties();
        pr.load(fr);
        System.out.println(pr.getProperty("testurl"));

	}

}
