package amazon;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int ch;
		FileReader fr =null;
		FileWriter fw =null;
		String str = "Lets write and read from a file !!!!\n";
		
		String str1 = "Lets not write and read from a file !!!!";
		try {	
			fw = new FileWriter("/Users/Documents/test.txt");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=0;i<str.length();i++)
			fw.append(str.charAt(i));
		fw.append(str1);
		fw.close();
		try {
			 fr = new FileReader("/Users/Documents/test.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Lets Read");
		while((ch=fr.read())!= -1){
			System.out.print((char)ch);

		}
		fr.close();
	}

}
