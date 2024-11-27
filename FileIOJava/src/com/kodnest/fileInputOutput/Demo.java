package com.kodnest.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args) {
		try {
		String f1 = "C:\\IO\\input.txt";
		String f2 = "C:\\IO\\ouput.txt";
//		FileInputStream fis = new FileInputStream(f1);
//		FileOutputStream fos = new FileOutputStream(f2);
		
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		
		int x;
		while((x = fr.read()) != -1) {
			fw.write(x);
		}
		fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
