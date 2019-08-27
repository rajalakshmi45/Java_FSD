package comm.example.FileStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInputOutputSteam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File inputFile = new File("TextFile1");
		File outputFile = new File("TextFile2");
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		BufferedReader inputStream = new BufferedReader(in);
		PrintWriter outputStream = new PrintWriter(out);
		int c;
		String l;
		while((l = inputStream.readLine()) != null)
		{
			System.out.println(l);
			outputStream.println();
		}
		System.out.println("FileInputStream is used to read a file and FileOutputStream is used to write a file");
		in.close();
		out.close();
		
		

	}

}
