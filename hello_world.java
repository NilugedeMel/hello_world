//  import libraries
import java.util.Scanner;

public class hello_world {

        //  global variables
        String phrase = "";

        public static void main (String [] args) {
                hello_world start = new hello_world ();
                start.user_input ();
        }

        void user_input () {
                Scanner input = new Scanner (System.in);
                System.out.println ("Enter a phrase");
                phrase = input.nextLine ();
                System.out.println ("Your phrase was " + phrase);
        }

}
