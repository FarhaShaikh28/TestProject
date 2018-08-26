package Common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTextFile {
	
	//To read a text file and print only letters

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReader file=new FileReader("C:\\Users\\dell\\Desktop\\Test.txt");
		
		BufferedReader br=new BufferedReader(file);
		
		
		while(br.ready()){
			
			String data=br.readLine();
			String data1[]= data.split(",");
			for(int i=0;i<data1.length;i++){
				System.out.print(data1[i]);
			}			
			
		}
		
		FileWriter fw=new FileWriter("C:\\Users\\dell\\Desktop\\Test.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("LM");
		bw.newLine();
		bw.write("N");
		bw.flush();
		bw.close();

	}

}
