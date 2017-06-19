package jojigarcia.me;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message;
        String out = "";
        char key;
        int intKey;

        // Ask the user for a message to encode or decode
        System.out.println("Enter a message to encode or decode: ");
        message = input.nextLine();

        while (message.length()>0) {
            System.out.println("Enter a secret key: (-26 to 26)");
            intKey = Integer.parseInt(input.nextLine());
            key = (char)intKey;

            for (int i = 0; i<message.length(); i++){
                char in  = message.charAt(i);

                if (in >= 'A' && in <= 'Z'){
                    in+= key;

                    if (in > 'Z'){
                        in -= 26;
                    }

                    if (in < 'A'){
                        in += 26;
                    }
                }

                if (in >= 'a' && in <= 'z'){
                    in+= key;

                    if (in > 'z'){
                        in -= 26;
                    }

                    if (in < 'a'){
                        in += 26;
                    }
                }

                out += in;
            }

            System.out.println(out);

            out = "";

            System.out.println("Enter another message, or press ENTER to end:  ");
            message = input.nextLine();
        }
    }
}
