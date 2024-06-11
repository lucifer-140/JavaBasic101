package Java_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("Java_FileWriter/poem.txt");
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
			writer.append("\n(A poem by Bro)");
			writer.close();

		} 
		catch (IOException e) {
			e.printStackTrace();

		}
	}
}


