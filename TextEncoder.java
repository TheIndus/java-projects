import java.util.*;

public class TextEncoder {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Encode or decode? (Enter E/D)");
                String encodeOrDecode = scanner.nextLine();
                    if (encodeOrDecode.equalsIgnoreCase("e")) {
                        System.out.println("Enter Text");
                        String encodeText = scanner.nextLine();
                        System.out.println("Encoding");
                           String encode = Base64.getEncoder().encodeToString(encodeText.getBytes());
                           String encode2 = Base64.getEncoder().encodeToString(encode.getBytes());
                           String encode3 = Base64.getEncoder().encodeToString(encode2.getBytes());
                           String encode4 = Base64.getEncoder().encodeToString(encode3.getBytes());
                           String encode5 = Base64.getEncoder().encodeToString(encode4.getBytes());
                           System.out.println("Encoded Text: " + encode5);
                    } else if (encodeOrDecode.equalsIgnoreCase("d")) {
                        System.out.println("Enter Text");
                        String encodeText = scanner.nextLine();
                        System.out.println("Decoding");
                           try {
                           byte[] decodeByte = Base64.getDecoder().decode(encodeText);
                           String decode = new String(decodeByte);

                           byte[] decodeByte2 = Base64.getDecoder().decode(decode);
                           String decode2 = new String(decodeByte2);

                           byte[] decodeByte3 = Base64.getDecoder().decode(decode2);
                           String decode3 = new String(decodeByte3);

                           byte[] decodeByte4 = Base64.getDecoder().decode(decode3);
                           String decode4 = new String(decodeByte4);

                           byte[] decodeByte5 = Base64.getDecoder().decode(decode4);
                           String decode5 = new String(decodeByte5);
                           System.out.println("Decoded Text: " + decode5);
                        } catch (Exception e) {
                            System.err.println("Decoding failed. String not valid.");
                        }

                    } else {
                        System.err.println("Enter a valid option.");
                    }
        scanner.close();
    }
}