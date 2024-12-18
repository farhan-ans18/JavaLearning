package com.kodnest.fileInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedUse {

	public static void main(String[] args) {
		try {
			String st1 = "C:\\IO\\input.txt";
			String st2 = "C:\\IO\\ouput.txt";
			
			FileReader fr = new FileReader(st1);
			FileWriter fw = new FileWriter(st2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String x;
			
			while((x = br.readLine()) != null) {

                bw.write(x);
                bw.newLine();
			}
			
			bw.flush();
			fr.close();
			fw.close();
			br.close();	
			bw.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
