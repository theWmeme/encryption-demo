import java.util.*;



public class Main {



    public static void main(String[] args) {
        //step 1: define what you are trying to access (word, text, whatever)
        //step 2: set a password
        //step 3: form an algorithm that will scramble whatever your password is (set as "encrypted version")
        //step 4: give a guide for descrambling the password
        //step 5: make user guess based on scrambler
        System.out.println("Welcome to my simple encryption demo! \nWould you like to try and decrypt the text yourself, or have it decrypted for you:");
        System.out.println("1 = decrypt myself \n2 = decrypt for me");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1) {
            System.out.println("You have decided to decrypt it yourself yourself!");
        }
        else if(choice == 2) {
            System.out.println("You want me to decrypt the chosen text");
        }


    }
}