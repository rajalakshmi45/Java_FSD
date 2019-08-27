package comm.example.FileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleEncryption {
	
	void encrypt(String source, String dest, int shift) throws IOException {
		
		BufferedReader reader;
		BufferedWriter writer;
		
		reader = new BufferedReader(new FileReader(source));
		writer = new BufferedWriter(new FileWriter(dest));
		String str = reader.readLine();
		
		int data,count;
		while (str != null) {
			count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
				{
					count++;
				}
				data = (int) str.charAt(i) + shift;
				writer.write(data);
				
			}
			writer.write("-count:" + count+'\n');
			
			str = reader.readLine();
		}
		reader.close();
		writer.close();
	}
	
	public void viewFileContent(String filename) throws IOException
	{
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(filename));
		String line = reader.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = reader.readLine();
		}
	}

}
