
import java.io.File;  // Import the File class
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;  // Import the IOException class to handle errors
public class hack {
	private int NFICHEIROS = 10000;
	public hack() {
		int i=0;
		int NUMBER = NFICHEIROS;
		Random rd = new Random();
		String[] names = new String[NUMBER];
		while (i<NUMBER) {
			String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char letter = abc.charAt(rd.nextInt(abc.length()));
			char letter2 = abc.charAt(rd.nextInt(abc.length()));
			char letter3 = abc.charAt(rd.nextInt(abc.length()));
			char letter4 = abc.charAt(rd.nextInt(abc.length()));
			String newName = new StringBuilder().append(letter).append(letter2).append(letter3).append(letter4).append(".txt").toString();
			names[i]= newName;
			i++;
		}
		for(int k=0;k<names.length;k++) {
			generateFiles(names[k]);
		}

	}
	private static void generateFiles(String name) {
		try {
		      File myObj = new File(name);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
}
