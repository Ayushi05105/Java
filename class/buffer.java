import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class buffer {

    // reading using buffer reader
    // public static void main(String[] args) {
    //     try{
    //         FileReader f = new FileReader("input.txt");
    //         BufferedReader bf = new BufferedReader(f);

    //         String line;

    //         while((line = bf.readLine()) != null){
    //             System.out.println(line);
    //         }
    //         bf.close();
    //         f.close();
    //     }
    //     catch(IOException e){
    //         System.out.println("Error reading file");
    //     }
    // }


    // writing using buffer writer

    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("output.txt");
            BufferedWriter  bw = new BufferedWriter(f);
            bw.write("Hello java");
            bw.newLine();
            bw.write("hello");
            bw.close();
            f.close();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println("Error write file");
        }
    }
    
}
