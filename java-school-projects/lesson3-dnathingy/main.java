import java.io.File; 
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileNotFoundException;  


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> st = new HashMap<String, String>();
        try {
            Scanner file1 = new Scanner(new File("DNAtoAA.txt"));
            while (file1.hasNextLine()) {
                String line = file1.nextLine();
                String[] words = line.split(" ");
                st.put(words[0], words[1]);
                
            }
            file1.close();
            System.out.print("Enter your file: \n");
            
            Scanner file2 = new Scanner(new File(scan.nextLine()));
            while (file2.hasNextLine()) {
                String line = file2.nextLine();
                String result = st.get(line);
                if (result != null) {
                    System.out.print(result);  
                } else {
                    System.out.print("\n no result for " + line);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("\nno file found");
        } finally {
            scan.close();  
        }
    }
}
