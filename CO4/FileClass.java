import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileClass {

	public static void main(String[] args)
	{

		try {

			FileWriter fw = new FileWriter("text.txt");
			fw.write("iam athira \n");
			
		    fw.close();
			FileReader fr = new FileReader("text.txt");
			String str = "";
  
            int i;
			while ((i = fr.read()) != -1) {
                str += (char)i;
            }
            System.out.println(str);
			System.out.println("\nFile read and write done");
            fr.close();

		}

		catch (IOException e) {

			System.out.println
				("There are some IOException");
		}
	}
}