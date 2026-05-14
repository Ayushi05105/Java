import java.util.Base64;;
public class base64 {


    // //encoding
    // public static void main(String[] args) {
    //     String text ="Hello java";
    //     String encoded = Base64.getEncoder().encodeToString(text.getBytes());

    //     System.out.println("original "+text);
    //     System.out.println("Encoded "+ encoded);
    // }

    //decoding
    public static void main(String[] args) {
        String encodedtext = "SGVsbG8gamF2YQ==";
        byte[] decodeBytes = Base64.getDecoder().decode(encodedtext);
        String decodedText = new String(decodeBytes);
        System.out.println("Decoded text: "+decodedText);
    }
    
}
