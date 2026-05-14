import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStream {

    // readFileInputStream

    // public static void main(String[] args) {
    //     try{
    //         FileInputStream f = new FileInputStream("input.txt");
    //         int i;
    //         while((i =f.read()) != -1){
    //             System.out.println((char)i);
    //         }
    //         f.close();
    //     }
    //     catch(IOException e){
    //         System.out.println("error reading file");
    //     }
    // }

    // writing a file using fileoutputStream

    public static void main(String[] args) {
        try{
            FileOutputStream f = new FileOutputStream("output.txt");

            String data ="Hello java";
            f.write(data.getBytes());
            f.close();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println("Error writingfile");
        }
    }
    
}
