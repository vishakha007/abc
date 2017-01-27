package amazon;
import java.io.*;
import java.net.*;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class URLClass {
	public void getURLinfo( URL Url1){
		System.out.println("URL Is "+Url1.toString());
		System.out.println("Protocol :"+Url1.getProtocol());
		System.out.println("File :"+Url1.getFile());
		System.out.println("Host : "+Url1.getHost());
		System.out.println("Port :"+Url1.getDefaultPort());
		System.out.println("Query : "+Url1.getQuery());
		System.out.println(Url1.getRef());
	}
	public static void main(String []args) throws IOException
	{
		URL Url1 = new URL("https://www.youtube.com/watch?v=YQHsXMglC9A");
		URLClass U = new URLClass();
		U.getURLinfo(Url1);
		URLConnection UC = Url1.openConnection();
		Map<String, List<String>> Headers = UC.getHeaderFields();
		for(Map.Entry<String, List<String>> header :Headers.entrySet())
			System.out.println(header);

		System.out.println(Headers.size());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(UC.getInputStream()));
		FileWriter f = new FileWriter("/Users/pravin/Documents/getSource_Youtube_Adele.txt", true);
		Path file = Paths.get("/Users/pravin/Documents/getSource_Youtube_Adele.txt");
		String i;
		while((i=br.readLine() )!=null)
			f.write(i);
//			//.write(i);
//			System.out.println(i);
	}

}
