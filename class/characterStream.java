import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterStream {


    // read file using fileReader
    
    // public static void main(String[] args) {
    //     try{
    //         FileReader f = new FileReader("input.txt");
    //         int i;
    //         while((i=f.read()) != -1){
    //             System.out.println((char)i);
    //         }
    //         f.close();
    //     }
    //     catch(IOException e){
    //         System.out.println("Error reading file");
    //     }
    // }

    //writing a file using fileWriter

    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("output.txt");

            f.write("Hello java");
            f.close();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println("Error file writing");
        }
    }
    
}
