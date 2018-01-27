package example;

import java.io.FileWriter;
import java.io.IOException;

public class example {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Example.txt");
	    fw.write("First line of the text file.");
	    fw.write('\r');
	    fw.write('\n');
	    fw.write("Second line of the text file.");
	    fw.write('\n');
	    fw.close();

	}

}
