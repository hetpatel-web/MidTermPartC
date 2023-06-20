package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Select your favorite genre: ");
        System.out.println("1 Comedy");
        System.out.println("2 Drama");
        System.out.println("3 Action");
        System.out.println("4 Mystery");
        int choice = input.nextInt();

        String genre = "";

        switch (choice) {
            case 1:
                genre = "Comedy";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Mystery";
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        UserProfile user = new UserProfile(name, genre);
        System.out.println("User profile created successfully!");
        System.out.println("User ID: " + user.getUserID());
        System.out.println("Favorite genre: " + user.getGenre());
    }
}
