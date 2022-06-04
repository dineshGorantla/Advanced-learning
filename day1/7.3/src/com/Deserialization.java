package com;

import java.io.FileReader;

public class Deserialization {
	Deserialization()
    {
        try{
        FileReader fr = new FileReader("output.txt");
        String str = "";
        int i;
	    while ((i = fr.read()) != -1)str += (char)i;
	    System.out.println("Data Stored in file : \n"+str);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
