package titkosito;
import java.io.*;

public class Titkosito {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("../jelszo.txt"));
		PrintWriter pw = new PrintWriter("titkosjelszo.txt");
		
		String szo =bf.readLine();
		String titkosjelszo= "";
		System.out.println("Eredeti jelszo: "+szo);
		
		while(szo!=null) {
			for(int i=0; i< szo.length(); i++) {
				
				char betu = szo.charAt(i);
				int sorszam= Integer.valueOf(betu);
				sorszam++;
				
				titkosjelszo= titkosjelszo+(char)sorszam;
				
			
			
			
			
			}
			//uj sor \n, de ezt nem tudom betenni
			szo=bf.readLine();
					
			
		}
		System.out.println("Titkosított jelszo: "+titkosjelszo);	
		pw.println(titkosjelszo);
		pw.flush();
		pw.close();
		bf.close();
		
	}


}
