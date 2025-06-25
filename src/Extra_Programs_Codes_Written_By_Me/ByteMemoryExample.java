package Extra_Programs_Codes_Written_By_Me;

public class ByteMemoryExample {


        public static void main(String[] args) {
            byte a = 10;

            // Print decimal value
            System.out.println("Decimal Value: " + a);

            // Convert to binary with leading zeros (8 bits)
            String binaryString = String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0');

            System.out.println("Binary (8 bits): " + binaryString);
        }
    }


